package com.hp.service.mail;

import java.security.GeneralSecurityException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;
import com.sun.mail.util.MailSSLSocketFactory;

@Service
public class MailUtil {
	public int send_mail(String to) {
		Properties properties=new Properties();
		properties.setProperty("mail.smtp.auth", "true");  
        // �����ʼ�������������  
		properties.setProperty("mail.smtp.host", "smtp.qq.com");  
        // �����ʼ�Э������  
		properties.setProperty("mail.transport.protocol", "smtp");  
		//��ssl
		MailSSLSocketFactory msf;
		try {
			msf = new MailSSLSocketFactory();
			msf.setTrustAllHosts(true);  
	        properties.put("mail.smtp.ssl.enable", "true");  
	        properties.put("mail.smtp.ssl.socketFactory", msf);
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
        Session session=Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("1879339027@qq.com", "nlqoozengdqjefjd");
			}
		});
        
        Message message=new MimeMessage(session);
        String temp="";
        for (int i = 0; i < 4; i++) {
			temp+=(int) (Math.random() * 10);
		}
        int authCode=Integer.parseInt(temp);
		try {
			message.setFrom(new InternetAddress("1879339027@qq.com"));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("����");
			message.setContent("�û�"+to+"�����֤���ǣ�"+authCode,"text/html;charset=UTF-8");
			Transport.send(message);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return authCode;
		
	}

}
