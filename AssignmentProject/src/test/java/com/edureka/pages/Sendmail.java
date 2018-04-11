package com.edureka.pages;

import java.io.IOException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.edureka.utilities.Base;

public class Sendmail{
	

	
	@AfterSuite
	public void reportGeneration() throws EmailException
	{
		System.out.println("Email started");
		
		 EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("C:\\Users\\Vivek\\workspace\\AssignmentProject\\test-output\\emailable-report.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Report Generation");
		  attachment.setName("Report");
		  
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465);
		  email.setSSLOnConnect(true);
		  email.setAuthenticator(new DefaultAuthenticator("s.vivek1010@gmail.com", "vivekvishnu1"));
		  email.addTo("viveksvvek@gmail.com", "Vivek");
	      email.setFrom("s.vivek1010@gmail.com", "vivek");
		  email.setSubject("The test report");
		  email.setMsg("Please find the attached report");

		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();
		  System.out.println("Email send");

}

}