package com.hp.service;

import com.hp.bean.UserBean;

public interface RegisterService {
	/**
	 * У���û���������
	 * @param judje
	 * @param id
	 * @return
	 */
	public String checkUser(String judje ,int id);
	/**
	 * UserBean ע��
	 * @param userBean
	 * @return
	 */
	public boolean registerUser(UserBean userBean);
}
