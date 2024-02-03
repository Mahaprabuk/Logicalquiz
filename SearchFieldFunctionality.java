package mypack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchFieldFunctionality {
   @Test
	public  void search() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://quiz.logicalmindsitsolutions.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
	 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("class1");
	 driver.findElement(By.xpath("//button[@class='searchbutton']//*[name()='svg']")).click();
	 
	 System.out.println("This class finished");
	 
	}
}
