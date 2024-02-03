package mypack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPositive {
public static WebDriver driver;
	
	@BeforeTest
	public void learnings_basic() {   
	        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	        driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	        String url = "https://quiz.logicalmindsitsolutions.com/";
	        driver.get(url);
	    
	}
	@Test(priority = 1)
	public void loginPositiveTest() throws InterruptedException {
	    // Click on the login button
	    driver.findElement(By.xpath("//a[@href='/Login']//button[contains(text(),'Login')]")).click();

	    // Enter email and password
	    driver.findElement(By.xpath("//input[@id='email']"))
	            .sendKeys("muthuselvan.govindharaj@logicalmindsit.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Muthu@123");

	    // Click on the submit button
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    // Use WebDriverWait instead of Thread.sleep for better synchronization
	    for (String handle : driver.getWindowHandles()) {
	        driver.switchTo().window(handle);
	    }
	    Thread.sleep(4000);
	    
        Alert alert = driver.switchTo().alert();
        alert.accept();
	}


}
