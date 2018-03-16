package com.junmeng.cloud.provider.resource;

import com.junmeng.cloud.provider.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by james on 2018/3/15.
 */
public interface IOperationResource {

    @GetMapping("/simple/{id}")
    User findById(@PathVariable Long id);

    @GetMapping("/simple/user/{id}")
    List<User> findByUserId(@PathVariable Long id);

    @GetMapping("/simple/user/all")
    List<User> findAll();
}
