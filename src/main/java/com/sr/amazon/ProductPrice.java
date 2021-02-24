package com.sr.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPrice {
	
	
	
	@FindBy(xpath="//td[text()='Price:']/../td[2]")
	private WebElement itsprice;
	
	public ProductPrice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void whatistheprice() {
		String sr = itsprice.getText();
		String[] srarr = sr.split(" ");
		System.out.println(srarr[1]);
	}
	
}
