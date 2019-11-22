package spiceJet;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseSpice.Base;
import Objects.PageObject_SpiceJet;




public class Home2 extends Base{
	@Test
	public void	brokenLinks() throws IOException{
		driver=initDriver();
		driver.get("https://gmail.com/");
		PageObject_SpiceJet p=new PageObject_SpiceJet(driver);
		List<WebElement> w=p.linksreturn();
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("no. of links "+w.size());
		for(int i=0;i<w.size();i++){
			
			URL url=new URL(w.get(i).getAttribute("href"));
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
			System.out.println(w.get(i).getAttribute("href"));
			connection.connect();  
			System.out.println(connection.getResponseMessage());
			connection.disconnect();
		
		}
		
	}


	@Test
	public void score() throws IOException
	{
		driver=initDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22977/afg-vs-wi-3rd-t20i-afghanistan-v-west-indies-in-india-2019");
		PageObject_SpiceJet p=new PageObject_SpiceJet(driver);
		
		List<WebElement> rows=p.scorecard();

		for(int i=0;i<rows.size()-1;i++){
			List<WebElement> w=rows.get(i).findElements(By.tagName("div"));
			String append="                  ";		
			
			for(int j=0;j<w.size()-1;j++){
			 append=append+"        "+w.get(j).getText();
			}
	System.out.println(append);
		}
	}
	
	
	@Test
	public void calen() throws IOException{
		driver=initDriver();
		driver.get("https://www.makemytrip.com/");
		PageObject_SpiceJet p=new PageObject_SpiceJet(driver);
		List<WebElement> d =p.date().findElements(By.xpath("//div[@class='DayPicker-Body']/div"));
		
		for(int i=0;i<d.size();i++){
		List<WebElement> w=	d.get(i).findElements(By.xpath("//div[@class='DayPicker-Week']"));
		
		for(int j=0;j<w.size();j++){
			List<WebElement> da=w.get(i).findElements(By.xpath("//div[@class='DayPicker-Day']"));
			for(int k=0;k<da.size();k++){
				 
			}
		}}
		}
	
	@Test
	public void script() throws IOException{
		
		driver=initDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		PageObject_SpiceJet p=new PageObject_SpiceJet(driver);
		p.fromm().sendKeys("Bang");
		p.fromm().sendKeys(Keys.DOWN);
		p.fromm().sendKeys(Keys.DOWN);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String s=(String) js.executeScript(script);
		System.out.println("string is "+s);
		

		}
	
	@Test
	public void ss() throws IOException{
		driver=initDriver();
		driver.get("https://www.google.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("screensnot.png"));
		
		WebElement gmail=driver.findElement(By.xpath("//a[@class='gb_g']"));
	//	Rectangle r=gmail.getRect();s
		//Rectanfgler=driver.findElement(By.xpath("//a[@class='gb_g']")).getRect();	
		
		
		
		File src1=((TakesScreenshot)gmail).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("C:\\Users\\Akhil\\elementSS.png"));
	}
	
	
	
		

		
		
		
	}
