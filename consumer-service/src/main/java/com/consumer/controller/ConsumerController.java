package com.consumer.controller;

import com.consumer.reference.client.UserClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: tushuai
 * @Description:
 * @Date Created in 2021-01-24 15:52
 * @Modified By:
 */
@RestController
@RequestMapping(value = "/consumer-service")
public class ConsumerController {

    @Resource
    private UserClient userClient;

    @GetMapping("/getStudent/{number}")
    public String getStudent(@PathVariable String number) {
        return userClient.getStudent(number);
    }
}
