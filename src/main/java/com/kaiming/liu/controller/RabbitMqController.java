package com.kaiming.liu.controller;

import com.rabbitmq.client.ShutdownSignalException;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistry;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author KaiMing
 * @version v1
 * @since 17/3/24
 */
@RestController
public class RabbitMqController {
    @Resource
    RabbitTemplate rabbitTemplate;
    @Resource
    RabbitListenerEndpointRegistry rabbitListenerEndpointRegistry;

    @GetMapping("send")
    public void send(){
        rabbitTemplate.convertAndSend("durableExchange","routingKey","aa");
//        rabbitTemplate.convertAndSend("durableQueue","aa");
    }

    @GetMapping("close")
    public void close(){
        rabbitListenerEndpointRegistry.stop();
    }
}
