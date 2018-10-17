package com.heima.serviceImpl;
import com.heima.mapper.UserMapper;
import com.heima.pojo.User;
import com.heima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteUser(Integer id) {
        return 0;
    }

    @Override
    public List<Map> selectByCondition(Map user) {
        return userMapper.selectByCondition(user);
    }
}
