package com.znsd.mq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.znsd.mq.test.StudentBean;

@Component
public class Receiveb {

	/*@RabbitListener(queues = "MyQueue") // ����������ָ����Queue
	public void process(StudentBean student) {
		System.out.println("Receive2:" + student);
	}
	*/
	//�㲥ģʽ
	/*@RabbitListener(queues = "fanout.B") 
	public void process(String str) {
		System.out.println("ReceiveB:" + str);
	}*/

}
