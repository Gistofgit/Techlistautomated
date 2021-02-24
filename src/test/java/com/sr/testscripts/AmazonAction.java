package com.sr.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;

import com.sr.amazon.Homepage;
import com.sr.amazon.ProductPrice;
import com.sr.amazon.SearchResults;
import com.sr.genericlib.BaseClass;

public class AmazonAction extends BaseClass{
	
	/*
	Use this for tracking cost of one plus earbuds
	Change url in base class
	url=https://www.amazon.in/
	searchquery=one plus
	*/
	
	@Test
	public void takeaction() throws FileNotFoundException, IOException, InterruptedException {
		Homepage h = new Homepage(driver);
		u.dropDown(h.getSearchdd(), "Electronics");
		h.clicksearchfld(d.getexcelData("Sheet1", 2, 1));
		h.clicksearchbttn();
		
		SearchResults sr = new SearchResults(driver);
		sr.clickresultiwant();
		
		u.switchtab(driver);
		
		ProductPrice prodp = new ProductPrice(driver);
		prodp.whatistheprice();
	}
}
