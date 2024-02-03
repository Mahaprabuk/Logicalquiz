

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

public class HomepageFooter {

    public static WebDriver driver; // Declared WebDriver at the class level so it can be used across methods

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

    @Test(priority = 1)
    public void Footer() throws InterruptedException {
        // Scroll down to make the footer visible
        scrollDown();

        // Find the footer element
        WebElement footer = driver.findElement(By.className("footer-container"));
        List<WebElement> links = footer.findElements(By.tagName("a"));
        int count = links.size();
        System.out.println("Number of links in the footer is: " + count);

        // Scroll back to the top
        scrollUp();

        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public static void company() throws InterruptedException {
        // Scroll down to make the section visible
        scrollDown();

        WebElement footer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[1]"));
        List<WebElement> links = footer.findElements(By.tagName("a"));
        int count_company = links.size();
        System.out.println("Number of links in the footer is: " + count_company);
        int count = 0;
        for (int j = 0; j < count_company; j++) {
            WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[1]"));
            List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

            linksnew.get(j).click();
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

        // Scroll back to the top
        scrollUp();
    }

    @Test(priority=3)
    public void support() throws InterruptedException {
        // Scroll down to make the section visible
        scrollDown();

        WebElement footer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[2]"));
        List<WebElement> links = footer.findElements(By.tagName("a"));
        int count_support = links.size();
        System.out.println("Number of links in the footer is: " + count_support);
        int count = 0;
        for (int j = 0; j < count_support; j++) {
            WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[2]"));
            List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

            linksnew.get(j).click();
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

   scrollUp();
    }

    @Test(priority=4)
    public void legal() throws InterruptedException {
        // Scroll down to make the section visible
        scrollDown();

        WebElement footer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[3]"));
        List<WebElement> links = footer.findElements(By.tagName("a"));
        int count_support = links.size();
        System.out.println("Number of links in the footer is: " + count_support);
        int count = 0;
        for (int j = 0; j < count_support; j++) {
            WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[3]"));
            List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

            linksnew.get(j).click();
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

        // Scroll back to the top
        scrollUp();
    }
    @Test(priority=5)
    public void social_media() throws InterruptedException {
        // Scroll down to make the section visible
        scrollDown();

        WebElement footer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[5]"));
        List<WebElement> links = footer.findElements(By.tagName("a"));
        int count_social = links.size();
        System.out.println("Number of links in the footer is: " + count_social);
        int count = 0;
        for (int j = 0; j < count_social; j++) {
            WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[5]"));
            List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

            linksnew.get(j).click();
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
        System.out.println("This class finished");

        // Scroll back to the top
        scrollUp();
    }
    

    // Scroll down method
    public static void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 3240.5)");
    }

    // Scroll up method
    public static void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 0)");
    }
   
}
