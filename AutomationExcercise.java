package com.labexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.get("https://automationexercise.com/login");
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		wd.manage().window().maximize();

	
		WebElement wb1= wd.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]"));
		wb1.sendKeys("kiran");
		System.out.println(wb1.getAttribute("value"));
		
		WebElement wb2= wd.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]"));
		wb2.sendKeys("kirankamdi631@gmail.com");
		System.out.println(wb2.getAttribute("value"));
		
		WebElement we=wd.findElement(By.xpath("//button[contains(text(),'Signup')]"));
		we.click();

		
//		WebElement wb4=wd.findElement(By.xpath("//input[@id='name']"));
//		wb4.sendKeys("kiran");
//		System.out.println(wb4.getAttribute("value"));
		
		WebElement wb5=wd.findElement(By.xpath("//input[@id='first_name']"));
		wb5.sendKeys("kiran");
		System.out.println(wb5.getAttribute("value"));
		
		WebElement wb6=wd.findElement(By.xpath("//input[@id='last_name']"));
		wb6.sendKeys("kamdi");
		System.out.println(wb6.getAttribute("value"));
		
		WebElement wb7=wd.findElement(By.xpath("//input[@id='company']"));
		wb7.sendKeys("cdac");
		System.out.println(wb7.getAttribute("value"));
		
		WebElement wb8=wd.findElement(By.xpath("//input[@id='address1']"));
		wb8.sendKeys("nagpur");
		System.out.println(wb8.getAttribute("value"));
		
		WebElement wb9=wd.findElement(By.xpath("//input[@id='state']"));
		wb9.sendKeys("mh");
		System.out.println(wb9.getAttribute("value"));
		
		WebElement wb10=wd.findElement(By.xpath("//input[@id='city']"));
		wb10.sendKeys("nagpur");
		System.out.println(wb10.getAttribute("value"));
		
		WebElement wb11=wd.findElement(By.xpath("//input[@id='zipcode']"));
		wb11.sendKeys("445501");
		System.out.println(wb11.getAttribute("value"));
		
		WebElement wb12=wd.findElement(By.xpath("//input[@id='mobile_number']"));
		wb12.sendKeys("7689541233");
		System.out.println(wb12.getAttribute("value"));
		
//		WebElement wb13=wd.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
//		wb13.click();
	}

}
