package com.consumer.reference.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: tushuai
 * @Description:
 * @Date Created in 2021-01-24 16:00
 * @Modified By:
 */
@FeignClient("user-service") // 动态代理类
public interface UserClient {

    @RequestMapping(value = "/user/byNumber1/{number}", method = RequestMethod.GET) // 注意拼接
    String getStudent(@PathVariable("number") String number); // 注解使用
}
