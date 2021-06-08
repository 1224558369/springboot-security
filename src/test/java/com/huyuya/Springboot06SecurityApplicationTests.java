package com.huyuya;

import com.huyuya.entity.Authority;
import com.huyuya.entity.User;
import com.huyuya.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot06SecurityApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
//        System.out.println(userMapper);
        User huyu = userMapper.getUserByName("huyu");
        System.out.println(huyu);
        List<Authority> huyu1 = userMapper.getAuthorityByUserName("huyu");
        huyu1.forEach(System.out::println);
    }

}
