package com.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class autosuggest  {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DHANANJAY\\eclipse-workspace//chromesetup//drivers//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\DHANANJAY\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bing.com/");
//		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Rest the Case");
//		List<WebElement> sugge=driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
//		int n=sugge.size();
//		System.out.println(n);
//		for(int i=0;i<n;i++)
//		{
//			WebElement option=sugge.get(i);
//		if(option.getText().equals("rest the case meaning"))
//		{
//			option.click();
//			break;
//		}
//		}	
		
		driver.findElement(By.xpath("//a[normalize-space()='Images']")).click();
		//Thread.sleep(2000);
			System.out.println(driver.getTitle());

	}

}
