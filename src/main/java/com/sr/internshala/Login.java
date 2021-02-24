package com.sr.internshala;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="(//button[contains(text(),'Login')])[2]")
	private WebElement fstloginbtn;
	
	@FindBy(id="modal_email")
	private WebElement emailfield;
	
	@FindBy(id="modal_password")
	private WebElement passfield;
	
	@FindBy(id="modal_login_submit")
	private WebElement scndloginbtn;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void firstloginbtnmtd() {
		fstloginbtn.click();
	}
	
	public void emailfieldmtd(String query) {
		emailfield.sendKeys(query);
	}
	
	public void passfieldmtd(String query) {
		passfield.sendKeys(query);
	}
	
	public void scndloginbtnmtd() {
		scndloginbtn.click();
	}
	
}
