package com.kaiming.liu.components;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author KaiMing
 * @version v1
 * @since 17/1/17
 */
@Component
public class Son {
    @Resource
    Father father;

    public Son() {
        System.out.println("this is son");
    }
}
