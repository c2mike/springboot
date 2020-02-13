package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;

@RestController
@EnableConfigurationProperties(com.example.demo.web.PropertyTest2.class)
public class PropertyTest {
    //方式1
   /* @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;*/

    @RequestMapping("/propertyTest")
    public String propertyTest(){
        return user.getName()+" "+user.getAge();
    }

    //方式2
    @Resource
    private PropertyTest2 user;

    @RequestMapping("/propertyTest2")
    public String propertyTest2()
    {
        return user.getName()+" "+user.getAge();
    }
}
