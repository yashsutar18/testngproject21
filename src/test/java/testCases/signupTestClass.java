package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resource.baseclass;
import Resource.commonMethods;
import Resource.constant;
import pageobjectmodel.LognInPageObjects;
import pageobjectmodel.SignUpPageObjects;

public class signupTestClass  extends baseclass {
	 
	

 @Test
 public void verifySignup() throws IOException, InterruptedException {
  
  LognInPageObjects LPO=new LognInPageObjects(driver);
  LPO.clickOnTryForFree().click();
  
  SignUpPageObjects SPO=new SignUpPageObjects(driver);
  
  Thread.sleep(3000);
  SPO.enterFirstname().sendKeys(constant.firstname);
  SPO.enterlastname().sendKeys(constant.lastname);
  SPO.enterwork().sendKeys(constant.enterwork);
  SPO.enterphone().sendKeys(constant.enterphone);
  
  
  commonMethods.selectDropdown(SPO.selectCompanyEmployees(), 1);
  
  commonMethods.selectDropdown(SPO.selectCountry(), 1);
  

 }

}
	