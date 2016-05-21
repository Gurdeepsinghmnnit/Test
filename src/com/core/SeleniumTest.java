package com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	
	
	public static void main(String [] args) throws InterruptedException
	{
		
	  WebDriver driver=new FirefoxDriver();	
	  driver.get("http://gmail.com");
	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("SeleniumBatch100");
	  driver.findElement(By.xpath("//input[@id='next']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("@Cell901");	
	  driver.findElement(By.xpath("//input[@id='signIn']")).click();
	}

}
