package BaseSpice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
public WebDriver driver;
public Properties prop;

	public WebDriver initDriver() throws IOException{
		
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Akhil\\com.spiceJet\\src\\main\\java\\resources\\details.properties");

		prop.load(fis);
	
		 String browser=prop.getProperty("browser");
		 //System.out.println("browser is " +browser);
		if(browser.equals("chrome")){
			System.out.println("browser is " +browser);
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		System.out.println("browser is " +browser);
		 driver=new ChromeDriver();
driver.manage().window().maximize();
	}
		else {
			System.out.println("Browser is not Chrome");
		}
		return driver;
	}
	
	
}
