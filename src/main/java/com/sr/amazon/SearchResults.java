package com.sr.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResults {

	
	@FindBy(xpath="//span[contains(text(),'OnePlus Bullets Wireless Z in-Ear')]")
	private WebElement resultiwant;
	
	public SearchResults(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickresultiwant() {
		resultiwant.click();;
	}
	
}
