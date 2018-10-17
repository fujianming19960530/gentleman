package com.heima.controller;

import com.heima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class loginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public @ResponseBody List<Map> user_login(@RequestBody Map map){
        /*Map<String,Object> getUserInfo = new HashMap<>();*/
        /*getUserInfo = userService.selectByCondition(null);*/
        System.out.println(map);
        return userService.selectByCondition(null);
    }

}
