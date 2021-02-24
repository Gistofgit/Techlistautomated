package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckSearchResult {
	
	@FindBy(xpath="//a[@href='https://weather.com/']")
	private WebElement searchresult;
	
	public DuckSearchResult(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnResult() {
		searchresult.click();
	}
}
