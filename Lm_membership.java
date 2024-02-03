package mypack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lm_membership {
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
	@Test
    public void Membership() throws InterruptedException {
        // Scroll down to make the section visible
        scrollDown();

        WebElement member = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]"));
        List<WebElement> links = member.findElements(By.tagName("a"));
        int count_member = links.size();
        System.out.println("Number of links in the member is: " + count_member);
        int count = 0;
        for (int j = 0; j < count_member; j++) {
            WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]"));
            List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

            linksnew.get(j).click();
            Thread.sleep(10000);
            String title = driver.getTitle();
            System.out.println("the title of the page is " + title);
            //String pageText = driver.findElement(By.tagName("h4")).getText();
            //System.out.println("Text from the current page:\n" + pageText);


            if (title.contains("Oops, something lost")) {
                System.out.println(" 404, Found the broken links");
                count++;
            }

            driver.navigate().back();

        }
        if (count == 0) {
            System.out.println(" no broken links");
        }
        System.out.println("This class finished");

        // Scroll back to the top
        scrollUp();
    }
    

    // Scroll down method
    public static void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2468.5)");
    }

    // Scroll up method
    public static void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 0)");
    }
   
    
}
