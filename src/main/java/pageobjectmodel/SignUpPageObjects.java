package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

 public WebDriver driver;

 By FirstName = By.xpath("//input[@name='UserFirstName']");
 
 By lastname = By.xpath("//input[@name='UserLastName']");

 By selectJobTitle = By.xpath("//select[@name='CompanyEmployees']");
 
 By work = By.xpath("//input[@name='UserEmail']");
 
 By company = By.xpath("//input[@name='CompanyName']");
 
 By phone = By.xpath("//input[@name='UserPhone']");
 
 By check = By.xpath("//input[@name='SubscriptionAgreement']");
 
 By country = By.xpath("//select[@name='CompanyCountry']");

 public SignUpPageObjects(WebDriver driver2) {

  this.driver=driver2;
 }
 
 public WebElement entercheck() {

	  return driver.findElement(check);
	 }

 public WebElement enterFirstname() {

  return driver.findElement(FirstName);
 }
 public WebElement enterphone() {

	  return driver.findElement (phone);
	 }
	 
 public WebElement enterlastname() {
	 
	 return driver.findElement(lastname);
	 
 }
 
 public WebElement entercompany() {

	  return driver.findElement(company);
	 }
public WebElement enterwork() {
	 
	 return driver.findElement(work);
	 
 }

 
 public WebElement selectCompanyEmployees() {

  return driver.findElement(selectJobTitle);
 }

public WebElement selectCountry() {
	
	return  driver.findElement(country);
}

}