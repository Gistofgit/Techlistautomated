package com.sr.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.sr.genericlib.BaseClass;
import com.sr.internshala.HomePage;
import com.sr.internshala.Login;

public class Internshala extends BaseClass{
	
	@Test
	public void perform() throws EncryptedDocumentException, IOException, InterruptedException {
		
		Login l = new Login(driver);
		l.firstloginbtnmtd();
		l.emailfieldmtd(d.getexcelData("Sheet1",3,3));
		l.passfieldmtd(d.getexcelData("Sheet1",3,4));
		l.scndloginbtnmtd();
		
		HomePage h = new HomePage(driver);
		Thread.sleep(3000);
		u.mouseHover(h.getInternvar(), driver);
		h.interndelvarmtd();
	}
}