package com.sr.testscripts;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.sr.genericlib.BaseClass;
import com.sr.techlistic.GithubFileDown;
import com.sr.techlistic.PracticeForm;

public class TechlisticFormSubmission extends BaseClass{
	
	@Test
	public void submitForm() throws EncryptedDocumentException, IOException, InterruptedException, AWTException { 
		PracticeForm pf = new PracticeForm(driver);
		pf.fstnameMtd();
		pf.lstnameMtd();
		pf.gndrMtd();
		pf.yrexpMtd();
		pf.dateMtd();
		pf.autotestMtd();
		pf.atoolsMtd();
		u.dropDown(pf.getSevencondd(), d.getexcelData("Sheet1", 4, 1));
		u.dropDown(pf.getSlcmmds(), d.getexcelData("Sheet1", 4, 3));
		u.dropDown(pf.getSlcmmds(), d.getexcelData("Sheet1", 4, 4));
		u.dropDown(pf.getSlcmmds(), d.getexcelData("Sheet1", 4, 5));
		u.dropDown(pf.getSlcmmds(), d.getexcelData("Sheet1", 4, 6));
		pf.upimgMtd();
		Thread.sleep(3000);
		pf.dlfilelnkMtd();
		u.navigateurl(driver, d.getexcelData("Sheet1", 4, 7));
		
		GithubFileDown gfd = new GithubFileDown(driver);
		gfd.rawMtd();
		//gfd.hndldown();
		//pf.submtbtnMtd();
		
	}	
}
