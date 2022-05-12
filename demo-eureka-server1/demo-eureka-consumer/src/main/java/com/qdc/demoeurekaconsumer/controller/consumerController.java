package com.qdc.demoeurekaconsumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class consumerController {
    //依赖restTemplate对象
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/users")
    public String testalluser() {
        return restTemplate.getForObject("http://EUREKA-PROVIDER/user/userall", String.class);
    }

    @RequestMapping(value = "/details/{userid}")
    public String testFetUserId(@PathVariable(value = "userid") String id) {
        return restTemplate.getForObject("http://EUREKA-PROVIDER/user/details?userid=", String.class);
    }

    @RequestMapping(value = "/port")
    public String testport() {
        return restTemplate.getForObject("http://EUREKA-PROVIDER/port", String.class);
    }

}
