package com.hp.mapper;

import com.hp.bean.UserBean;

public interface UserMapper {
	/**
	 * 用户名登陆查询
	 * @param name
	 * @return
	 */
	public UserBean selectUserByName(String name);
	/**
	 * 邮箱登陆查询
	 * @param name
	 * @return
	 */
	public UserBean selectUserByEamil(String name);
	
}
