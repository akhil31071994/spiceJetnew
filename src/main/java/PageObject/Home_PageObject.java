package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_PageObject {

	public WebDriver driver;
	By source=By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	
	public Home_PageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement sourceStation(){
		return driver.findElement(source);
		
		
	}
	
	
}
