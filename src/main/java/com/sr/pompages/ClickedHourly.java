package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickedHourly {
	
	
	@FindBy(name="caret-up")
	private WebElement arrow;
	
	public ClickedHourly(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnArrow() {
		arrow.click();
	}
}
