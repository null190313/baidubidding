package com.hp.mapper;

import com.hp.bean.UserBean;

public interface UserMapper {
	/**
	 * �û�����½��ѯ
	 * @param name
	 * @return
	 */
	public UserBean selectUserByName(String name);
	/**
	 * �����½��ѯ
	 * @param name
	 * @return
	 */
	public UserBean selectUserByEamil(String name);
	
}
