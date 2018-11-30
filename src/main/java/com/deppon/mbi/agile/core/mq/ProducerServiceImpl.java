package com.deppon.mbi.agile.core.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService{

	@Autowired
    private AmqpTemplate amqpTemplate;

	/**
     * 发送消息到指定队列
     * @param queueKey
     * @param object
     */
    @Override
    public void sendDataToQueue(String routingKey, Object message){
    	amqpTemplate.convertAndSend(routingKey, message);
    }
    
    
}
