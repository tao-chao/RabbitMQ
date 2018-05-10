package com.znsd.mq.test;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicRabbitConfig {

	final static String message = "topic.A";
    final static String messages = "topic.B";

    @Bean
    public Queue queueMessage() {
        return new Queue("topic.A");
    }

    @Bean
    public Queue queueMessages() {
        return new Queue("topic.B");
    }
    
	//�½�һ��������
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }
    
	//�󶨶��е���������,·��ģʽ����Ҫ����ƥ��topic.message�����ܽ���
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }
    //ǰ׺ƥ�䵽topic.���ɽ���
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}
