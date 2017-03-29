package com.kaiming.liu.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;

/**
 * @author KaiMing
 * @version v1
 * @since 17/3/25
 */
public abstract class Listener {
    @RabbitHandler
    public void process(String data) {
        this.adapt(data);
    }

    abstract void adapt(String data);
}
