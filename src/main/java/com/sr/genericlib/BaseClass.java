package com.sr.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass implements AutoConstant{
	
	public WebDriver driver;    //globally declared
	public ExcelData d = new ExcelData();
	public Propertyfile p;    //globally declared because we will use it globally
	public Photo ph;
	public Utilities u=new Utilities();
	
	@Parameters({"browsername"})
	@BeforeMethod
	public void openapp(String browser) throws FileNotFoundException, IOException {
		System.setProperty(key1, value1);
		System.setProperty(key2, value2);
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		p=new Propertyfile();
		//driver.get(p.getPropertyData("url"));    //Whoa!
		driver.get(d.getexcelData("Sheet1", 4, 0));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException, InterruptedException {
		int status = r.getStatus();
		String name = r.getName();
		if(status==1) {
			ph= new Photo();
			ph.getPhoto(driver, name);
		}
		Thread.sleep(5000);
		//driver.quit();
	}
}
