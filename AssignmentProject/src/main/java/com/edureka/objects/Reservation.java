package com.edureka.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reservation {
	
	
	WebDriver driver;
	
	
	
	public Reservation(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@value='Business']")
	WebElement preferenceclass;
	
	
	@FindBy(xpath="//select[@name='airline']")
	WebElement airlineprefer;
	
	@FindBy(xpath="//input[@name='findFlights']")
	WebElement next;
	
	
	@FindBy(xpath="//input[@value='Blue Skies Airlines$361$271$7:10']")
	WebElement outflight;
	
	@FindBy(xpath="//input[@value='Pangea Airlines$632$282$16:37']")
	WebElement inflight;
	
	
	
	@FindBy(xpath="//input[@name='reserveFlights']")
	WebElement search;
	
	@FindBy(name="passFirst0")
	WebElement firstname;
	
	@FindBy(name="passLast0")
	WebElement lastname;
	
	@FindBy(xpath="//select[@name='pass.0.meal']")
	WebElement mealprefer;

	@FindBy(xpath="//input[@name='creditnumber']")
	WebElement cardnumber;
	
	@FindBy(xpath="(//input[@name='ticketLess'])[2]")
	WebElement billaddress;

	@FindBy(xpath="//input[@name='buyFlights']")
	WebElement confirmbooking;
	
	
	
	public WebElement preference()
	{
		return preferenceclass;
	}
	
	
	public WebElement airlineprefer()
	{
		return airlineprefer;
	}
	

	public WebElement next()
	{
		return next;
	}
	
	public WebElement outflight()
	{
		return outflight;
	}
	
	public WebElement inflight()
	{
		return inflight;
	}
	
	public WebElement search()
	{
		return search;
	}
	
	public WebElement mealprefer()
	{
		return mealprefer;
	}

	public WebElement firstname()
	{
		return firstname;
	}
	public WebElement lastname()
	{
		return lastname;
	}
	public WebElement cardnumber()
	{
		return cardnumber;
	}
	public WebElement billaddress()
	{
		return billaddress;
	}
	public WebElement confirmbooking()
	{
		return confirmbooking;
	}
	
}
