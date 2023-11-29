package com.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DHANANJAY\\eclipse-workspace//chromesetup//drivers//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\DHANANJAY\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement country=driver.findElement(By.xpath("//select"));
		Select s = new Select(country);
		s.selectByVisibleText("India");
		driver.navigate().refresh();
//		s.selectByValue("NIU");
//		driver.navigate().refresh();
		s.selectByIndex(5);
		driver.quit();
		
		

	}

}
