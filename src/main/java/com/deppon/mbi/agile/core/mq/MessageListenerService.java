package com.deppon.mbi.agile.core.mq;

import java.lang.reflect.Method;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageListenerService implements MessageListener{

	@Autowired
	private ListenerService listenerService;
	
	@Override
    public void onMessage(Message msg) {
        try{
            Method declaredMethod = Message.class.getDeclaredMethod("getBodyContentAsString");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(msg);
        	listenerService.reduceBiz(invoke.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
