package com.heima.test;


import com.heima.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class test {

    @Autowired
    private UserService userService;

    @Test
    public void demo0702(){
        Map<String,Object> map = new HashMap<String, Object>();
        //map.put("username","哈哈哈哈哈");
        System.out.println(userService.selectByCondition(null));
    }
}
