package com.vehical;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class email {
	public void emailsend(String to)
	{
		final String SenderEmail ="adarshkainchugundi123@gmail.com";
		final String Password="sightwxnpserolfs";
		
		Properties prop = new Properties();
		prop.put("mail.smtp.auth","true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port","587");
		
		Session session = Session.getInstance(prop, 
				new javax.mail.Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(SenderEmail,Password);
			};
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("adarshkainchugundi123@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
//			Oracon or = new Oracon();
//			HomePage hp= new HomePage();
			//or.view1(usertext.getText());
		
			//String s10=mntext.getText();
			message.setSubject("Automotive !!!");
			message.setText("WELCOME TO OUR Automotive vehical service APPLICATION, HERE YOU CAN BOOK ANY TYPES OF Services related to vehical repairs, accessories and etc.");
			
			Transport.send(message);
			System.out.println("Send successfully");
			
			
		}
		catch(MessagingException e)
		{
			throw new RuntimeException(e);
		}
	}

}
