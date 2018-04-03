package com.hp.service;

import com.hp.bean.UserBean;

public interface LoginService {
	/**
	 * 登陆校验
	 * @param name
	 * @param password
	 * @return
	 */
	public boolean login(String name ,String password);
	/**
	 * 获取登陆的错误信息
	 * @param error
	 * @return
	 */
	public String loginError();
	/**
	 * 获取user数据
	 * @param user
	 * @return
	 */
	public UserBean getUser();
}
