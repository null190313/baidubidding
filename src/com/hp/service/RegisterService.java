package com.hp.service;

import com.hp.bean.UserBean;

public interface RegisterService {
	/**
	 * 校验用户名和邮箱
	 * @param judje
	 * @param id
	 * @return
	 */
	public String checkUser(String judje ,int id);
	/**
	 * UserBean 注册
	 * @param userBean
	 * @return
	 */
	public boolean registerUser(UserBean userBean);
}
