package com.znsd.mq.test;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySender {
	@Autowired
	private AmqpTemplate template;
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void send() {
		//template.convertAndSend("MyQueue", "消息");
		/*StudentBean student=new StudentBean(1,"王八","狗");
		template.convertAndSend("MyQueue",student);*/
		
		  //广播模式
		 /* String context = "hi, fanout msg ";
	        System.out.println("Sender : " + context);
	        this.rabbitTemplate.convertAndSend("fanoutExchange","", context);*/
	}
	
	//主题模式
	 public void send0() {
	        String context = "hi, i am message all";
	        System.out.println("Sender : " + context);
	        this.rabbitTemplate.convertAndSend("topicExchange", "topic.1", context);
	    }

	    public void send1() {
	        String context = "hi, i am message 1";
	        System.out.println("Sender : " + context);
	        this.rabbitTemplate.convertAndSend("topicExchange", "topic.message", context);
	    }

	    public void send2() {
	        String context = "hi, i am messages 2";
	        System.out.println("Sender : " + context);
	        this.rabbitTemplate.convertAndSend("topicExchange", "topic.messages", context);
	    }
}
