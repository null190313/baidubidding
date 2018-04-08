package com.hp.mapper;

import com.hp.bean.UserBean;

public interface UserMapper {
	/**
	 * 用户名查询
	 * @param name
	 * @return
	 */
	public UserBean selectUserByName(String name);
	/**
	 * 邮箱查询
	 * @param name
	 * @return
	 */
	public UserBean selectUserByEamil(String name);
	
	/**
	 * 添加UserBean对象
	 * @param userBean
	 * @return
	 */
	public int addUser(UserBean userBean);
	
	
}
