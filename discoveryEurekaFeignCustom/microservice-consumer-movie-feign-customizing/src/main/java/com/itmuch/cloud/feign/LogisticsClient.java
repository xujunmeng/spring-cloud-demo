package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import com.itmuch.config.Configuration1;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

/**
 * Created by james on 2018/3/15.
 */
//@FeignClient(name = "xxxx", url = "http://localhost:7900/", configuration = Configuration1.class)
@FeignClient(name = "xxxx", url = "${logistics.server}", configuration = Configuration1.class)
public interface LogisticsClient{

 @RequestLine("GET /simple/user/{id}")
 List<User> findUserById(@Param("id") Long id);

}
 /**
 * 1：url 替换 ok
 * 2：日志
 * 3：复用问题
 *  Feign supports boilerplate apis via single-inheritance interfaces. This allows grouping common operations into convenient base interfaces.
 * 4：有时间了解原理
 * 5：callback对应的请求哪种方式处理
 */
