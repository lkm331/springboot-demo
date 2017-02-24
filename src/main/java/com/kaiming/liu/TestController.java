package com.kaiming.liu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author KaiMing
 * @version v1
 * @since 17/1/12
 */
@RestController
public class TestController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //shijian
        System.out.println(new Date(1485220091173L));
        System.out.println(new Date(1485237794137L));
        System.out.println(new Date(1485240298903l));
    }
}
