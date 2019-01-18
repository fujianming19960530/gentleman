package com.heima.controller;

import com.heima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserService userService;

    /*@RequestMapping("/oneUser")
    public @ResponseBody List<Map> oneUser(@RequestBody Map map){
        return userService.selectByCondition(map);
    }*/




}
