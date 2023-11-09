package finalprojectutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class parent111 {
	
		public static Properties metaprop1 ;
		public static WebDriver driver;
		
		 public parent111(){

		
				try {
					 FileInputStream flise = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\java\\congif111\\config111.properties");
					Properties metaprop = new Properties ();
					metaprop.load(flise);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		 public void metaBrowser1() {
			 
			  String Browser1= metaprop1.getProperty("Brower11");
			  
			  if(Browser1.equalsIgnoreCase("Chrome"));
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdriver1\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(testdata111.impicitywait));
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(testdata111.pageloadwait));
			 
		 }
		 public  void lunchurl111(String URL111) 
		 {
			 driver.get( metaprop1.getProperty("URL111"));
			 
			 
		 }
		 
		 
			 
		 
		 }
		
			 
		 





