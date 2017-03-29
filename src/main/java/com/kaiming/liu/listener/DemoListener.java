package com.kaiming.liu.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @author KaiMing
 * @version v1
 * @since 17/3/28
 */
public class DemoListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("aaa");
    }
}
