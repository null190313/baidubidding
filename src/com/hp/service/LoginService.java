package com.hp.service;

import com.hp.bean.UserBean;

public interface LoginService {
	/**
	 * ��½У��
	 * @param name
	 * @param password
	 * @return
	 */
	public boolean login(String name ,String password);
	/**
	 * ��ȡ��½�Ĵ�����Ϣ
	 * @param error
	 * @return
	 */
	public String loginError();
	/**
	 * ��ȡuser����
	 * @param user
	 * @return
	 */
	public UserBean getUser();
}
