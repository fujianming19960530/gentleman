package com.heima.test;


import com.heima.service.UserService;
import com.heima.util.DateConverter;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class test {

    @Autowired
    private UserService userService;

    @Test
    public void demo0702(){
        Map<String,Object> map = new HashMap<String, Object>();
        DateConverter dateConverter = new DateConverter();
        Date endSuspend =dateConverter.convert("2019-02-03 20:20:33");
        Date now = new Date();
        System.out.println(endSuspend+"/n"+now);
        //map.put("username","哈哈哈哈哈");
        //System.out.println(userService.selectByCondition(null));
    }
}
