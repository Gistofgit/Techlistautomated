package com.sr.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.sr.genericlib.BaseClass;
import com.sr.pompages.ClickedHourly;
import com.sr.pompages.DuckHome;
import com.sr.pompages.DuckSearchResult;
import com.sr.pompages.WeatherWebsite;

public class SearchHourlyWeather extends BaseClass{

	@Test
	public void shw() throws FileNotFoundException, IOException, InterruptedException {
		
		/*
		url=https://duckduckgo.com/
		searchquery=Weather
		*/
		
		DuckHome dh = new DuckHome(driver);
		dh.type(p.getPropertyData("searchquery"));
		dh.searchButton();
		
		DuckSearchResult dsr = new DuckSearchResult(driver);
		dsr.clickOnResult();
		
		Thread.sleep(10000);
		
		WeatherWebsite ww = new WeatherWebsite(driver);
		ww.clickOnHourly();
		
		ClickedHourly coh = new ClickedHourly(driver);
		coh.clickOnArrow();
	}
}
