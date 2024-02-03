package mypack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpFunctionality {
	
	@Test
	public  void Sign_up() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://quiz.logicalmindsitsolutions.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Join Now']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rohit");
		driver.findElement(By.xpath("//div[@class='register']//input[@placeholder='Email']")).sendKeys(" rohit@logicalmindsit.com");
		driver.findElement(By.xpath("//div[@class='register']//input[@placeholder='Password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("15");
		driver.findElement(By.xpath("//input[@placeholder='Standard']")).sendKeys("1d0");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("95600638358");
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
		
		 System.out.println("This class finished");
		
		 
	}
}
