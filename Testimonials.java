package mypack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testimonials {

    public static WebDriver driver;

    @BeforeTest
    public void basic() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String url = "https://quiz.logicalmindsitsolutions.com/";
        driver.get(url);
    }

    @Test
    public void Testimonials_page() throws InterruptedException {
        WebElement readMore = driver.findElement(By.xpath("//span[@class='read-more']"));
        readMore.click();
        Thread.sleep(3000);
        WebElement becomeMember = driver.findElement(By.xpath("//button[@class='cta-btn crisp-button']"));
        becomeMember.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("prabtgeteu124584");
		driver.findElement(By.xpath("//div[@class='register']//input[@placeholder='Email']")).sendKeys("mahdgda123f4ttt5@gmail.com");
		driver.findElement(By.xpath("//div[@class='register']//input[@placeholder='Password']")).sendKeys("1234str65711");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("1234str65711");
		driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("1gd2fe3");
		driver.findElement(By.xpath("//input[@placeholder='Standard']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("98iuy9de4trwt5833315");
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
		
		driver.navigate().back();
		
		
		WebElement elements = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div"));
		List<WebElement> button = elements.findElements(By.tagName("button"));
		int count = button.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			WebElement elements1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div"));
			List<WebElement> button1 = elements1.findElements(By.tagName("button"));
			
			button1.get(i).click();
            Thread.sleep(10000);
            String title = driver.getTitle();
            System.out.println("the title of the page is " + title);

            if (title.contains("Oops, something lost")) {
                System.out.println(" 404, Found the broken links");
                count++;
            }

            driver.navigate().back();

        }
        if (count == 0) {
            System.out.println(" no broken links");
        }
        String testi = driver.findElement(By.xpath("//div[@class='filter-buttons']")).getText();
        System.out.println("text for UKG ;  " +testi );
        Thread.sleep(3000);
        System.out.println("invalid createntials");
        System.out.println("This class finished");

		
    }

}
