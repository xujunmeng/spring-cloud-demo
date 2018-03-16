package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by james on 2018/3/16.
 */
public class FeignConsumerClientHystrix implements UserFeignClient{

    @Override
    public User findById(@PathVariable("id") Long id) {
        System.out.println("error");
        return null;
    }

    @Override
    public User postUser(@RequestBody User user) {
        System.out.println("error");
        return null;
    }

    @Override
    public User getUser(User user) {
        System.out.println("error");
        return null;
    }
}
