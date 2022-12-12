package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resource.baseclass;
import Resource.commonMethods;
import Resource.constant;
import pageobjectmodel.LognInPageObjects;

public class LoginTestCase extends baseclass{
 
 @Test
 public void login() throws IOException {
	
	
	  LognInPageObjects LPO=new LognInPageObjects(driver);
	  
	  LPO.enterUsername().sendKeys(constant.username);
	  LPO.enterPassword().sendKeys(constant.password);
	  LPO.clickOnLogin().click();
	 
	  commonMethods.handleAssertion(LPO.erroMessage().getText(), constant.erroMessage);

	   
	 }


}
