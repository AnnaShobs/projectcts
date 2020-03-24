package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wishlist {
	WebDriver driver;
	By desktop=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By product=By.xpath("//*[@id=\"content\"]/div[4]/div[6]/div/div[1]/a/img");
	By wishcomponent=By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]/i");
	public void url() 
	{ // url for launch the chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\cognizant materials\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void HomePage() //using webdriver get visting the testing website
	{
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}
	public void desktopselect()
	{
		driver.findElement(desktop).click();
		driver.findElement(all).click();
	}
	public void wish()
	{
		driver.findElement(product).click();
		driver.findElement(wishcomponent).click();
	}
	
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File(path));
	}
	
	public void closebrowser() {
		driver.close();
	}


}
