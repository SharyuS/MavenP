package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test01 extends BaseClass {
	
	@Test
	public void Test_001() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_Sendkeys(login.getTxt_email(), "SharyuRs");
		Library.custom_Sendkeys(login.getTxt_password(), "SS125648");
		
		Library.getCaptureScreenShot();
	}

}
