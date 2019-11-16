package spiceJet;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.Home_PageObject;
import resources.BaseSpice;

public class HomePage extends BaseSpice {
	
@Test
public void invokeDriver() throws IOException{
	driver=initDriver();
driver.get("https://www.spicejet.com/");

Home_PageObject hpo=new Home_PageObject(driver);

hpo.sourceStation().sendKeys("KNP");



}
	
}
