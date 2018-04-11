package com.edureka.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	
	WebDriver driver;
	
public Loginpage(WebDriver driver){
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



@FindBy(xpath="//input[@name='userName']")
WebElement username;

@FindBy(xpath="//input[@name='password']")
WebElement password;

@FindBy(xpath="//input[@name='login']")
WebElement login;


public WebElement username()
{
	return username;
	
}
	
public WebElement paswrd()
{
	return password;
	
}

public WebElement login()
{
	return login;
	
}
	
}

