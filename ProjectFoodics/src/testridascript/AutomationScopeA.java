package testridascript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationScopeA {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.navigate().to("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		  // Change language to English
		   WebElement lang = driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a"));
		   lang.click();
		 
		   // Type in search bar
		   WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
		   search.sendKeys("Mercedes A Class");
		
		   // Delete keyword/text
		   driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).clear();
		   
		   WebElement searchB = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
		   searchB.sendKeys("BMW 2023");
		   
		   // Submit your text
		    WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		    submit.click();
		    
		    WebElement videos = driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/div/div[1]/div/div/div[1]/div/div/div[1]/a[2]/div"));
		    videos.click();
		    Thread.sleep(3000);
		    
		  // Assert number of results on UI 
		    
		  List<WebElement> results = driver.findElements(By.xpath("/html/body/div[5]/div/div[7]/div/div[1]/div/div/div/div/nobr"));   
		  //Get the Total Count
		  System.out.println(results.size());
		  
		  //Scroll down till the bottom of the page
		  JavascriptExecutor js2 = (JavascriptExecutor) driver;
		  js2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  // click on page 2 
		  WebElement page2 = driver.findElement(By.xpath("/html/body/div[5]/div/div[11]/div/div[4]/div/div[3]/table/tbody/tr/td[3]/a"));
		  page2.click();
		  
		  JavascriptExecutor js3 = (JavascriptExecutor) driver;
		  js3.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  // click on page 3
		  WebElement page3 = driver.findElement(By.xpath("/html/body/div[5]/div/div[11]/div/div[4]/div/div[3]/table/tbody/tr/td[4]"));
		  page3.click();
		  Thread.sleep(2000);
		  
		  // Validating number of results on page 2&3 is equal or not
		  WebElement matchingResult= driver.findElement(By.xpath("/html/body/div[5]/div/div[7]/div/div[1]/div/div/div/div"));
		 List<WebElement> listResult= matchingResult.findElements(By.xpath("/html/body/div[5]/div/div[7]/div/div[1]/div/div/div/div"));
		  System.out.println(listResult.size());
		  
		  
		  driver.close();
		 
		
	}

}
