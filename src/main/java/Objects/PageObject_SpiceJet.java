package Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject_SpiceJet{

	public WebDriver driver;
	By source=By.id("ctl00_mainContent_ddl_originStation1_CTXT");

	By dd=By.id("ctl00_mainContent_DropDownListCurrency");
	By addon=By.id("highlight-addons");
	By links=By.tagName("a");
	
	By xdriver=By.xpath("//*[@id='innings_1']/div[1]/div");
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
	public List<WebElement> linksreturn()
	{
		return driver.findElements(links);
		
	}
	
	public List<WebElement> scorecard(){
		return driver.findElements(xdriver);
		
	}
}
