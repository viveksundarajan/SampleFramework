package com.edureka.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.edureka.objects.Reservation;
import com.edureka.utilities.Base;

public class Reserveflight extends Base {
	
	
	
	public Reserveflight() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void bookDetails() throws InterruptedException, IOException
	{
		Reservation r=new Reservation(driver);
	
			
		Thread.sleep(1000);
		r.preference().click();
		WebElement el=r.airlineprefer();
		Select s=new Select(el);
		s.selectByIndex(2);
		r.next().click();
		r.outflight().click();
		r.inflight().click();
		scroll();
		Thread.sleep(3000);
		r.search().click();
		
		r.firstname().sendKeys(fname);
		r.lastname().sendKeys(lname);
		WebElement el1=r.mealprefer();
		Select s1=new Select(el1);
		s1.selectByIndex(4);
		r.cardnumber().sendKeys(cardnum);
		 System.out.println(fname + lname + cardnum);
		r.billaddress().click();
		r.confirmbooking().click();
	}
	
	
	

}
