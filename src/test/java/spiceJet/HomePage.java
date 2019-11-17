package spiceJet;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObject.PageObject_SpiceJet;
import resources.BaseSpice;

public class HomePage extends BaseSpice {
	
@Test
public void invokeDriver() throws IOException{
	driver=initDriver();
driver.get("https://www.spicejet.com/");

PageObject_SpiceJet hpo=new PageObject_SpiceJet(driver);

hpo.sourceStation().sendKeys("KNP");



}


@Test
public void hoveronElemet() throws IOException{
	
driver=initDriver();

driver.get("https://www.spicejet.com/");
PageObject_SpiceJet hp=new PageObject_SpiceJet(driver);

Actions a=new Actions(driver);
a.moveToElement(hp.hoveronEle()).build().perform();


}


@Test
public void dropdown() throws IOException{
	
	driver=initDriver();
	driver.get("https://www.spicejet.com/");
	PageObject_SpiceJet p=new PageObject_SpiceJet(driver);
	Select s=new Select(p.ddselect());
s.selectByIndex(1);	
}

}
