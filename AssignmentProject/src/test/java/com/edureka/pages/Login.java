package com.edureka.pages;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.edureka.objects.Loginpage;
import com.edureka.utilities.Base;

public class Login extends Base {


	
	
	public Login() throws IOException {
		super();
		
	}

	@BeforeTest
	public void homePage() throws IOException
	{
		
		driver=invokeBrowser();	
		driver.get(URL);
}
	
	@Test
	public void enterCredentials()
	{
		Loginpage lp=new Loginpage(driver);
		
		
		lp.username().sendKeys(uname);
		lp.paswrd().sendKeys(pwd);
		lp.username().click();
		lp.login().click();
		
		
		Assert.assertFalse(URL.contains("http://newtours.demoaut.com/mercuryreservation.php"));
	
		
		
	}

	
	
}
