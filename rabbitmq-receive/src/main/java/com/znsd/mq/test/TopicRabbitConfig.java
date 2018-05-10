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
    
	//新建一个交换机
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }
    
	//绑定队列到交换机上,路由模式，需要完整匹配topic.message，才能接受
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }
    //前缀匹配到topic.即可接受
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}
