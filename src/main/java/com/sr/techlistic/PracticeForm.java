package com.sr.techlistic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {
	
	@FindBy(name="firstname")
	private WebElement fstname;
	
	@FindBy(name="lastname")
	private WebElement lstname;
	
	@FindBy(id="sex-0")
	private WebElement gndr;
	
	@FindBy(id="exp-4")
	private WebElement yrexp;
	
	@FindBy(id="datepicker")
	private WebElement date;
	
	@FindBy(id="profession-1")
	private WebElement autotest;
	
	@FindBy(id="tool-2")
	private WebElement atools;
	
	@FindBy(id="continents")
	private WebElement sevencondd;
	
	public WebElement getSevencondd() {
		return sevencondd;
	}
	
	@FindBy(id="selenium_commands")
	private WebElement slcmmds;

	public WebElement getSlcmmds() {
		return slcmmds;
	}
	
	@FindBy(id="photo")
	private WebElement upimg;
	
	@FindBy(xpath="//a[text()='Click here to Download File']")
	private WebElement dlfilelnk;
	
	@FindBy(id="submit")
	private WebElement submtbtn;

	public PracticeForm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fstnameMtd() {
		fstname.sendKeys("John");
	}
	
	public void lstnameMtd() {
		lstname.sendKeys("Doe");
	}
	
	public void gndrMtd() {
		gndr.click();
	}
	
	public void yrexpMtd() {
		yrexp.click();
	}
	
	public void dateMtd() {
		date.sendKeys("01/01/1970");
	}
	
	public void autotestMtd() {
		autotest.click();
	}
	
	public void atoolsMtd() {
		atools.click();
	}
	
	public void upimgMtd() {
		upimg.sendKeys("C:\\Users\\Superuser\\g2mui_L9he0ktQIb.jpg");
	}
	
	public void dlfilelnkMtd() {
		dlfilelnk.click();
	}
	
	public void submtbtnMtd() {
		submtbtn.click();
	}

}
