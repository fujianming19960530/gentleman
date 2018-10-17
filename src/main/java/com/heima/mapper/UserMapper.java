package com.heima.mapper;


import com.heima.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //删除用户信息
    /*int deleteByPrimaryKey(Integer id);*/

    List<Map> selectByCondition(Map map);

}