package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import excelutility.WritingToExcel;

public class StoreToExcel {
	WebDriver driver;
	By desktop=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By product=By.xpath("//*[@id=\"content\"]/div[4]/div[6]/div/div[1]/a/img");
	
	public void url(String browser) //for launching the browser either in chrome or firefox
	{ try
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("WebDriver.geckodriver", "src/test/resources/Driver/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver_v80.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();//Maximizing the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Waiting time
		
	}
		catch (WebDriverException e) 
		{
			System.out.println(" browser could not be launched");//If browser does not launched diplays message
		}
	
		
	}
	public void HomePage() //using webdriver get visting the testing website
	{
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}
	public void desktopselect() throws InterruptedException//to select the desktop module and the product we want
	{
		driver.findElement(desktop).click();
		driver.findElement(all).click();
		Thread.sleep(2000);
		driver.findElement(product).click();
		
	}
	public void exceldata()//enter the descriptions into an excel sheet
	{
		
		String o=driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/div/p[2]")).getText();
		WritingToExcel x=new WritingToExcel();
		x.write_excel(0, 0, o);
	}
	public void screenshot(String path) throws IOException//taking screenshots
	
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File(path));
	}
	
	public void closebrowser()//closing the browser 
	{
		driver.close();
	}

	

}
