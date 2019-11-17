package spiceJet;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
public void test(){
	System.out.println("akhil is my name");
}

}
