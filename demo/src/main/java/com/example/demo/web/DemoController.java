package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 陶韧
 * @Date: Created in 2019/5/27 20:09
 * @Description:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/get")
    public String getParam (String param) {
        return param;
    }

}
