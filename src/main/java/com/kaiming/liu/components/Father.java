package com.kaiming.liu.components;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author KaiMing
 * @version v1
 * @since 17/1/17
 */
@Component
public class Father {
    @Resource
    Son son;

    public Father() {
        System.out.println("this is father");
    }
}
