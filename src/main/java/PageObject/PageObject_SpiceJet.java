package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject_SpiceJet {

	public WebDriver driver;
	By source=By.id("ctl00_mainContent_ddl_originStation1_CTXT");

	By dd=By.id("ctl00_mainContent_DropDownListCurrency");
	By addon=By.id("highlight-addons");
	public PageObject_SpiceJet(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement sourceStation(){
		return driver.findElement(source);
		
		
	}
	public WebElement hoveronEle(){
		return driver.findElement(addon);
	}
	public WebElement ddselect(){
		return driver.findElement(dd);
	}
	
}
