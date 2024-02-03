package mypack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Play_Video {

	@Test
	public  void video()  throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://quiz.logicalmindsitsolutions.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 2200)");
        Thread.sleep(2000);
        
        WebElement play = driver.findElement(By.xpath("//video[normalize-space()='Your browser does not support the video tag.']"));
		play.click();
		Thread.sleep(3000);
		WebElement maximize = driver.findElement(By.xpath("//video[normalize-space()='Your browser does not support the video tag.']"));
		maximize.click();
		WebElement volume = driver.findElement(By.xpath("//video[normalize-space()='Your browser does not support the video tag.']"));
		volume.click();
		WebElement play1 = driver.findElement(By.xpath("//video[normalize-space()='Your browser does not support the video tag.']"));
		play1.click();
		
		 System.out.println("This class finished");
		
		
	}

}
