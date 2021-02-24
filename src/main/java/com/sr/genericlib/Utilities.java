package com.sr.genericlib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	/**
	 * To handle dropdown
	 * @param ele
	 * @param text
	 */
	
	public void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	/**
	 * To perform mouseactions
	 * @param driver
	 * @param ele
	 */
	
	public void mouseHover(WebElement ele,WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	/**
	 * To perform double click
	 * @param driver
	 * @param target
	 */
	
	public void doubleClick(WebDriver driver, WebElement target) {
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
	}
	
	/**
	 * To handle the scrollbar
	 * @param driver
	 * @param x
	 * @param y
	 */
	
	public void scrollBar(WebDriver driver, int x, int y) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	/**
	 * To handle the alert pop-up
	 * @param driver
	 */
	
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * To wait for the element to be clickable
	 * @param driver
	 * @param element
	 */
	
	public void elementToBeClicked(WebDriver driver, WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void switchtab(WebDriver driver) {
		Set<String> ch = driver.getWindowHandles();
		for(String b:ch) {
			driver.switchTo().window(b);
		}
	}
	
	public void navigateurl(WebDriver driver, String secondurl) {
		driver.navigate().to(secondurl);
	}
	
}
