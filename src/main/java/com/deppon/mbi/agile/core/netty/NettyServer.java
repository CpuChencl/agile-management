package com.deppon.mbi.agile.core.netty;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

@Component
public class NettyServer {

	@Value("netty.host")
	private String host;
	@Value("netty.port")
	private String port;
	
	@PostConstruct
	public void initServer(){
		// 1 创建线两个事件循环组
        // 一个是用于处理服务器端接收客户端连接的
        // 一个是进行网络通信的（网络读写的）
        EventLoopGroup pGroup = new NioEventLoopGroup();
        EventLoopGroup cGroup = new NioEventLoopGroup();
        
        //辅助工具类
        ServerBootstrap bootStrap = new ServerBootstrap();
        bootStrap.group(pGroup, cGroup)
        .channel(NioServerSocketChannel.class)
        .option(ChannelOption.SO_BACKLOG, 1000)
        .option(ChannelOption.SO_SNDBUF, 32*1024)
        .option(ChannelOption.SO_KEEPALIVE, true)
        .option(ChannelOption.SO_RCVBUF, 32*1024)
        .childHandler(new ChannelInitializer<SocketChannel>() {

			@Override
			protected void initChannel(SocketChannel sc) throws Exception {
				// 使用DelimiterBasedFrameDecoder设置结尾分隔符$_
                ByteBuf buf = Unpooled.copiedBuffer("$_".getBytes());
                sc.pipeline().addLast(new DelimiterBasedFrameDecoder(1024, buf));
                // 设置字符串形式的解码.  经过StringDecoder, Handler回调方法中接收的msg的具体类型就是String了(不再是ByteBuffer). 但写时仍需要传入ByteBuffer
                sc.pipeline().addLast(new StringDecoder());
                // 通信数据的处理逻辑
                sc.pipeline().addLast(new NettyServerHandler());
			}
		});
        // 4 绑定端口, bind返回future(异步), 加上sync阻塞在获取连接处
        ChannelFuture cf1;
		try {
			cf1 = bootStrap.bind(host,Integer.parseInt(port)).sync();
			//ChannelFuture cf2 = b.bind(8764).sync();   //可以绑定多个端口
	        // 5 等待关闭, 加上sync阻塞在关闭请求处
	        cf1.channel().closeFuture().sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        pGroup.shutdownGracefully();
        cGroup.shutdownGracefully();
	}
}
