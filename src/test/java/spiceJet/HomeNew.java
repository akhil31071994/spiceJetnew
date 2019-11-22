package spiceJet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseSpice.Base;
import Objects.PageObject_SpiceJet;

public class HomeNew extends Base {

	@BeforeTest
	public void testt() {
		System.out.println("I will execute before all the test casess");
	}
	
	

	@Test
	public void invokeDriver() throws IOException {
		driver = initDriver();
		driver.get("https://www.spicejet.com/");

		PageObject_SpiceJet hpo = new PageObject_SpiceJet(driver);

		hpo.sourceStation().sendKeys("KNP");

	}

	@Test
	public void hoveronElemet() throws IOException {

		driver = initDriver();

		driver.get("https://www.spicejet.com/");
		PageObject_SpiceJet hp = new PageObject_SpiceJet(driver);

		Actions a = new Actions(driver);
		a.moveToElement(hp.hoveronEle()).build().perform();

	}

	@Test
	public void dropdown() throws IOException {

		driver = initDriver();
		driver.get("https://www.spicejet.com/");
		PageObject_SpiceJet p = new PageObject_SpiceJet(driver);
		Select s = new Select(p.ddselect());
		s.selectByIndex(1);
	}

	@BeforeTest
	public void closeBrowser() throws IOException {

	System.out.println("i will execute before the tests");
	}
	
	@Test
	public void serch() throws IOException{
		
		driver=initDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("akhil");
	}
	
	@Test
	public void sibling() throws IOException{
		driver=initDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='a4bIc']/div[1]/following-sibling::input")).sendKeys("dog is my favorite animal");;
	}

	@Test 
	public void parent() throws IOException{
		driver=initDriver();	
		driver.get("http://www.qaclickacademy.com/interview.php");
	
		driver.findElement(By.xpath("//li[@id='tablist1-tab2']/parent::ul/li[2]")).click();
	}
	
	@Test
	public void rightclick() throws IOException{
		driver=initDriver();	
		driver.get("https://www.google.com/");
		Actions a=new Actions(driver);
		a.contextClick(driver.findElement(By.id("tablist1-tab2"))).build().perform();
		
	}
	
	@Test
	public void doubleclick() throws IOException{
		driver=initDriver();	
		driver.get("https://www.google.com/s");
		driver.findElement(By.xpath("//div[@class='a4bIc']/div[1]/following-sibling::input")).sendKeys("dog is my favorite animal");
		
		Actions a=new Actions(driver);
		a.doubleClick(driver.findElement(By.xpath("//div[@class='a4bIc']/input"))).build().perform();
		
	}
}
