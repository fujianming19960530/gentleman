package com.heima.controller;

import com.heima.core.Const;
import com.heima.core.ResponseResult;
import com.heima.service.UserService;
import com.heima.util.Base64Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 登录方法
 *
 */
@Controller
@RequestMapping("/loginController")
public class loginController{

    @Autowired
    private UserService userService;

    //用户登录信息
    @RequestMapping("/login")
    @ResponseBody
    public ResponseResult login(@RequestBody Map<String,String> map) {
        ResponseResult result = new ResponseResult(Const.login.LOGIN_MESSAGE_CODE_1000);
        //调用用户登录service,保存登录信息，loginResult是结果，message是信息
        Map<String,String> loginInfo = userService.user_login(map);
        if("0".equals(loginInfo.get("loginResult"))){
            result.setCodeInfo(Const.login.LOGIN_MESSAGE_CODE_004);
        }if("1".equals(loginInfo.get("loginResult"))){
            result.setCodeInfo(Const.login.LOGIN_MESSAGE_CODE_1000);
        }if("2".equals(loginInfo.get("loginResult"))){
            result.setCodeInfo(Const.login.LOGIN_MESSAGE_CODE_2000);
        }if("3".equals(loginInfo.get("loginResult"))){
            result.setCodeInfo(Const.login.LOGIN_MESSAGE_CODE_003);
        }
        result.setResult(loginInfo);
        result.setRes_message(loginInfo.get("message"));
        return result;
    }
}
