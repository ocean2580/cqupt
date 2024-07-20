package com.sps.controller;/**
 * @Author Oliver
 * @Date 2024/7/20 09:30
 * @version 1.0
 * @注释
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: cqupt-2024
 * @Titile: HelloController
 * @Author: Oliver
 * @Description: TODO
 */
@RestController
@RequestMapping("api")
public class HelloController {
    @GetMapping("hello")
    public String test() {
        return "Hello World";
    }
}
