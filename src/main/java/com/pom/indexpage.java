package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class indexpage extends Base {
	
	
	@FindBy(xpath="//a[normalize-space()='Images']")
	static WebElement image;
	
	
	public indexpage( WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void image_click() throws InterruptedException
	{
		Thread.sleep(2000);
		image.click();
	}

}
