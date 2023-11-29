package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.indexpage;

public class indexpagetest {
	
	private	WebDriver driver;

	@BeforeMethod
	public void startbrowser() {
		Base base = new Base();
		base.setUp();
		driver = base.driver;
	}

	@Test
	public void verifytitle() throws InterruptedException {
		indexpage index = new indexpage(driver);
		index.image_click();
		String title_get = driver.getTitle();
		String actual_title = "Bing Image Inspiration Feed"; 
		assert title_get.equals(actual_title);
	}
}
