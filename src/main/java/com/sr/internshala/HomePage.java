package com.sr.internshala;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="(//a[contains(text(),'Internships')])[3]")
	private WebElement internvar;
	
	@FindBy(xpath="//a[text()='Internship in Delhi']")
	private WebElement interndelvar;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getInternvar() {
		return internvar;
	}
	
	public void interndelvarmtd() {
		interndelvar.click();
	}
	
	
}
