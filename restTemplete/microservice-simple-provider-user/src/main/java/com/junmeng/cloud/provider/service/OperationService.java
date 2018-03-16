package com.junmeng.cloud.provider.service;

import com.junmeng.cloud.provider.entity.User;
import com.junmeng.cloud.provider.repository.UserRepository;
import com.junmeng.cloud.provider.resource.IOperationResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by james on 2018/3/15.
 * 注意：
 *     1:@PathVariable类似的注解必须加上
 */
@RestController
public class OperationService implements IOperationResource {

    @Autowired
    private UserRepository userRepository;

    public User findById(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        Example<User> example = Example.of(user);
        return userRepository.findOne(example).get();
    }

    public List<User> findByUserId(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        Example<User> example = Example.of(user);
        List<User> users = userRepository.findAll(example);
        return users;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
