package com.kaiming.liu.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author KaiMing
 * @version v1
 * @since 17/3/25
 */
//@RabbitListener(queues = "durableQueue")
@Component
public class SubListener extends Listener {
    @Override
    void adapt(String data) {
        System.out.println(data);
    }
}
