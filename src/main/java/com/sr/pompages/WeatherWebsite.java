package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeatherWebsite {
	
	@FindBy(xpath="//span[text()='Hourly']")
	private WebElement hourly;
	
	public WeatherWebsite(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHourly() {
		hourly.click();
	}
}
