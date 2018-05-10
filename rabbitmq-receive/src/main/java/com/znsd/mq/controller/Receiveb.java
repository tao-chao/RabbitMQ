package com.znsd.mq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.znsd.mq.test.StudentBean;

@Component
public class Receiveb {

	/*@RabbitListener(queues = "MyQueue") // 监听器监听指定的Queue
	public void process(StudentBean student) {
		System.out.println("Receive2:" + student);
	}
	*/
	//广播模式
	/*@RabbitListener(queues = "fanout.B") 
	public void process(String str) {
		System.out.println("ReceiveB:" + str);
	}*/

}
