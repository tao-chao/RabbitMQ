package com.znsd.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.znsd.mq.test.MySender;

@RestController
public class TestRabbitMQ {

	@Autowired
	private MySender sender;

	@RequestMapping("/sender")
	public void sender() {
		sender.send0();
		sender.send1();
		sender.send2();
	}

}