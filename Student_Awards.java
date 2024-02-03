
package mypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Student_Awards {

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

    @Test(priority = 0)
    public void Login() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/Login']//button[contains(text(),'Login')]")));

        // Click on the Login link
        loginLink.click();

        // Rest of your code remains the same from this point onwards
        driver.findElement(By.id("email")).sendKeys("muthuselvan.govindharaj@logicalmindsit.com");
        driver.findElement(By.id("password")).sendKeys("Muthu@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Handle the alert after login
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.dismiss(); // Use dismiss() to close the alert without accepting it
        } catch (Exception e) {
            // Alert not present, continue with the test
        }
    }

    @Test()
    public void studentAwardsTest() throws InterruptedException {
        WebElement learning = driver.findElement(By.xpath("//a[contains(text(), 'Learning')]"));
        learning.click();

        WebElement studentAwards = driver.findElement(By.xpath("//h4[normalize-space()='Student awards']"));
        studentAwards.click();

        Thread.sleep(3000);

        // Find all elements in the specified div
        WebElement container = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]"));
        List<WebElement> elements = container.findElements(By.tagName("div"));
        int count = elements.size();
        System.out.println("Number of classes: " + count);

        // Loop through each element, get text, and click using Actions class with a pause of 4 seconds
        Actions actions = new Actions(driver);
        for (WebElement element : elements) {
            // Extract and print the text of each element
            String elementText = element.getText();
            System.out.println("Element Text: " + elementText);

            // Perform the click
            actions.moveToElement(element).click().perform();

            // Add a pause of 4 seconds between clicks
            
            Thread.sleep(4000);
        }
        System.out.println("This class finished");
    }
    
}
