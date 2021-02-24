package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckHome {
	
	@FindBy(id="search_form_input_homepage")
	private WebElement searchfield;
	
	@FindBy(id="search_button_homepage")
	private WebElement sbtn;
	
	public DuckHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void type(String query) {
		searchfield.sendKeys(query);
	}
	
	public void searchButton() {
		sbtn.click();
	}
}
