package com.hp.mapper;

import com.hp.bean.UserBean;

public interface UserMapper {
	/**
	 * �û�����ѯ
	 * @param name
	 * @return
	 */
	public UserBean selectUserByName(String name);
	/**
	 * �����ѯ
	 * @param name
	 * @return
	 */
	public UserBean selectUserByEamil(String name);
	
	/**
	 * ���UserBean����
	 * @param userBean
	 * @return
	 */
	public int addUser(UserBean userBean);
	
	
}
