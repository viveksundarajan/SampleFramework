package com.edureka.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public static WebDriver driver;
	public String browsername;
	public String URL;
	protected String uname;
	protected String pwd;
	public String fname;
	public String lname;
	public String cardnum;
	
	public Base() throws IOException{
	
	Properties prop=new Properties();

	FileInputStream fi=new FileInputStream("C:\\Users\\Vivek\\workspace\\AssignmentProject\\src\\main\\java\\com\\edureka\\utilities\\datadriven.properties");
	prop.load(fi);
	browsername=prop.getProperty("browser");
	URL=prop.getProperty("url");
uname= prop.getProperty("Username");
pwd= prop.getProperty("password");
fname= prop.getProperty("firstname");
lname=prop.getProperty("lastname");
cardnum=prop.getProperty("creditcard");
	}
	 
	public WebDriver invokeBrowser() throws IOException
	{
	

		
		/*Properties prop=new Properties();

		FileInputStream fi=new FileInputStream("C:\\Users\\Vivek\\workspace\\AssignmentProject\\src\\main\\java\\com\\edureka\\utilities\\datadriven.properties");
		prop.load(fi);
		String browsername=prop.getProperty("browser");
		URL=prop.getProperty("url");
 uname= prop.getProperty("Username");
 pwd= prop.getProperty("password");
 fname= prop.getProperty("firstname");
 lname=prop.getProperty("lastname");
 cardnum=prop.getProperty("creditcard");*/
	


		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vivek\\Downloads\\geckodriver-v0.16.0-win64\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}

		else
		{

			System.out.println("chrome is invoking");
		}

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			return driver;
			

	}
	
	public void scroll()
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1500)");
	}

}
