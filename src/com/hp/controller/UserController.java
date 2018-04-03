package com.hp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.hp.bean.UserBean;
import com.hp.service.LoginService;
import com.hp.service.mail.MailUtil;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {
	
	@Autowired
	private LoginService loginService;
	
	//跳转login.jsp页面
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	//登陆校验
	@RequestMapping(value="/check",	method=RequestMethod.POST)
	public String loginCheck(String usrename,String password,Model model) {
		boolean boo=loginService.login(usrename, password);
		if(boo) {
			model.addAttribute("user", loginService.getUser());
			return "success";
		}
		model.addAttribute("error",loginService.loginError());
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(UserBean registerUser) {
		
		return "login";
	}
	
	@Autowired
	private MailUtil mailutil;
	
	@RequestMapping(value="/mail_code",method=RequestMethod.GET)
	@ResponseBody
	public ModelMap sendAuthCode(String to) {
		ModelMap model=new ModelMap();
		model.put("code", mailutil.send_mail(to));
		return model;
	}
	

}
