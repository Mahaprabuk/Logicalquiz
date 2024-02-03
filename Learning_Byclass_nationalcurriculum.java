
package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Learning_Byclass_nationalcurriculum {
    @Test
    public void National_curicuium() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://quiz.logicalmindsitsolutions.com/");

        WebElement learningLink = driver.findElement(By.xpath("//a[contains(text(), 'Learning')]"));
        learningLink.click();

        WebElement N_Curi = driver.findElement(By.xpath("//h3[contains(text(),'🗒 National Curriculum')]"));
        N_Curi.click();

        List<WebElement> buttons = driver.findElements(By.xpath("//button"));

        // Print the number of buttons
        System.out.println("Number of Buttons: " + buttons.size());

        Actions actions = new Actions(driver);

        for (int i = 5; i < buttons.size(); i++) {
            WebElement button = buttons.get(i);
            String buttonText = button.getText();
            System.out.println("Button Text at index " + i + ": " + buttonText);

            try {
                // Use Actions class to perform the click
                actions.moveToElement(button).click().build().perform();

                // Wait for the page to load (you may need to use explicit waits)
                Thread.sleep(5000);

                // Get the title of the page
                String title = driver.getTitle();
                System.out.println("The title of the page is: " + title);
            } catch (org.openqa.selenium.ElementNotInteractableException e) {
                System.out.println("Button at index " + i + " is not interactable. Skipping...");
            } finally {
                // Navigate back to the main page for the next iteration
                driver.navigate().back();
                // Re-locate the buttons on the page
                buttons = driver.findElements(By.xpath("//button"));
            }
            System.out.println("This class finished");
        }

        // Close the browser
        driver.quit();
    }
    
    
}
