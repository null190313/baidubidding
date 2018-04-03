package com.hp.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.UserBean;
import com.hp.mapper.UserMapper;
import com.hp.service.LoginService;
@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserMapper userMapper;
	
	private UserBean user=null;
	
	private int error;

	@Override
	public boolean login(String name, String password) {
		String chick="^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
		//������ʽ��ģʽ
		Pattern p = Pattern.compile(chick);
        //������ʽ��ƥ����
        Matcher m = p.matcher(name);
		if(m.matches()) {
			user=userMapper.selectUserByEamil(name);
		}else {
			user=userMapper.selectUserByName(name);
		}
		if(user!=null) {
			if(user.getUpwd().equals(password)) {
				return true;
			}else {
				error=2;
			}
		}else {
			error=1;
		}
		return false;
	}
	
	@Override
	public String loginError() {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "�û���������");
		map.put(2, "�������");
		map.put(3, "�˺��쳣");
		return map.get(error);
	}

	@Override
	public UserBean getUser() {
		return this.user;
	}

}
