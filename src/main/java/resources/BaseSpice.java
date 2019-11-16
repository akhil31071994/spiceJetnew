package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSpice 
{
public WebDriver driver;
	public WebDriver initDriver() throws IOException{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Akhil\\com.spiceJet\\src\\main\\java\\resources\\details.properties");

		prop.load(fis);

		String browser=prop.getProperty("browser");
		
		if(browser=="chrome")
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
	
		 driver=new ChromeDriver();
		return driver;
	}
	
	
	
	
}
