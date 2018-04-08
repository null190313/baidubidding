package com.hp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.UserBean;
import com.hp.mapper.UserMapper;
import com.hp.service.RegisterService;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public String checkUser(String judje, int id) {
		String check=null;
		switch (id) {
		case 1:
			if(userMapper.selectUserByName(judje)!=null) {
				check="用户名已存在";
			}
			break;
		case 3:
			if(userMapper.selectUserByEamil(judje)!=null) {
				check="此邮箱已注册过";
			}
			break;

		default:
			break;
		}
		return check;
	}

	@Override
	public boolean registerUser(UserBean userBean) {
		int i = userMapper.addUser(userBean);
		if(i==1) {
			return true;
		}
		return false;
	}

}
