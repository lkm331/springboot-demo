package com.kaiming.liu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
