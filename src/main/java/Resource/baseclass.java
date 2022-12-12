package Resource;

	import java.io.FileInputStream;
	//import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

	public class baseclass {

		public WebDriver driver;
		
		
	 public void browserIntialization() throws IOException {

	  // To read the properties file-
	  FileInputStream fis = new FileInputStream
			  ( "C:\\Users\\hp\\eclipse-workspace\\z_selenium_testngproject\\src\\main\\java\\Resource\\data.properties");
	  
	      // "C:\\Users\\bhagy\\Desktop\\Technogeecks\\Selenium19thSep22TestNGPRoject\\src\\main\\java\\Resources\\data.properties");

	  // To access the proprtes file
	  Properties prop = new Properties();
	  prop.load(fis);

	  String browserName = prop.getProperty("browser");

	  if (browserName.equalsIgnoreCase("chrome")) {

	
	  driver = new ChromeDriver();
	 

	  } else if (browserName.equalsIgnoreCase("firefox")) {

	   // firefox code

	  } else {

	   System.out.println("please enter valid browser name");
	  }
	 }
	 @BeforeMethod
	 public void launch() throws IOException {

	  
	  browserIntialization();
	  driver.get("https://login.salesforce.com/");  
	  
	 }

	 }
	 

	
