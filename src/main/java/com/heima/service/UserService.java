package com.heima.service;

import com.heima.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {

	//删除用户信息
	int deleteUser(Integer id);

	List<Map> selectByCondition(Map map);

}
