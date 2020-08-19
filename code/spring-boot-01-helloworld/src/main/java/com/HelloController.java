package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 将主配置类（@SpringBootApplication标注的类）的所在包及下面所有子包里面的所有组件扫描到Spring容器
 * 此类不在主配置类的所在包中，不可以扫描到 Spring 容器
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/NoScanIntoTheSpringContainer")
    public String hello(){
        return "Hello World!";
    }
}
