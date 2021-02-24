package com.sr.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(id="searchDropdownBox")
	private WebElement searchdd;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchfld;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchbttn;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchdd() {
		return searchdd;
	}
	
	public void clicksearchfld(String query) {
		searchfld.sendKeys(query);
	}
	
	public void clicksearchbttn() {
		searchbttn.click();
	}
	
}
