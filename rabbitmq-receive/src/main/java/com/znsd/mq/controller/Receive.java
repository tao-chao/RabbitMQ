package com.znsd.mq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.znsd.mq.test.StudentBean;

@Component
public class Receive {
/*
	@RabbitListener(queues = "MyQueue") // 监听器监听指定的Queue
	@RabbitHandler
	public void process(StudentBean student) {
		System.out.println("Receive1:" + student);
	}*/
	
	//广播模式
	/*@RabbitListener(queues = "fanout.A") 
	public void process(String str) {
		System.out.println("ReceiveA:" + str);
	}*/

}
