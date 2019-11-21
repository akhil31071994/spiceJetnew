package spiceJet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
}