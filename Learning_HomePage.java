package mypack;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class  Learning_HomePage {
	//private static final String Systom = null;
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


	
	
	@Test(priority=2)
	public void learnings() {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/ul/li[1]"));
		Actions action = new Actions(driver);
		action .moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//h3[contains(text(),'🔺 Maths')]")).click();
		
		boolean maths= driver.findElement(By.xpath("//h3[contains(text(),'🔺 Maths')]")).isDisplayed();
		System.out.println(maths);
		if(maths) {
			
			System.out.println("Maths is present");
			}
		else {
			System.out.println("Maths is Not present");
		
		}
	 try {
         Thread.sleep(3000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
}
	@Test(priority=3)
	public void learnings_topic() {
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Learning']"));
		Actions action = new Actions(driver);
		action .moveToElement(element).perform();
		
		driver.findElement(By.xpath("//h4[normalize-space()='By topic']")).click();
		
		boolean Bytopic= driver.findElement(By.xpath("//h4[normalize-space()='By topic']")).isDisplayed();
		System.out.println(Bytopic);
	
		if(Bytopic) {
			
			System.out.println("Bytopic is present");
			}
		else {
			System.out.println("Bytopic is Not present");
		
		}
		 try {
	         Thread.sleep(3000);
	     } catch (InterruptedException e) {
	         e.printStackTrace();
	     }
	}
	@Test(priority=4)
	public void learnings_curriculam_() {
		WebElement element1 = driver.findElement(By.xpath("//a[normalize-space()='Learning']"));
		Actions action = new Actions(driver);
		action .moveToElement(element1).perform();
		
		driver.findElement(By.xpath("//h4[normalize-space()='Maths curriculum alignments']")).click();
		
		 try {
	         Thread.sleep(3000);
	     } catch (InterruptedException e) {
	         e.printStackTrace();
	}
		 }
	@Test(priority=5)
	public void learnings_() {
		WebElement element1 = driver.findElement(By.xpath("//a[normalize-space()='Learning']"));
		Actions action = new Actions(driver);
		action .moveToElement(element1).perform();
		
		driver.findElement(By.xpath("//h4[normalize-space()='Student awards']")).click();
		
		boolean Awards= driver.findElement(By.xpath("//h4[normalize-space()='Student awards']")).isDisplayed();
        if(Awards) {
			
			System.out.println("Awards is present");
			}
		else {
			System.out.println("Awards is Not present");
		
		}
		 try {
	         Thread.sleep(3000);
	     } catch (InterruptedException e) {
	         e.printStackTrace();
	}
		 }
	@Test(priority=6)
	public void learnings_certificates() {
		WebElement element1 = driver.findElement(By.xpath("//a[normalize-space()='Learning']"));
		Actions action = new Actions(driver);
		action .moveToElement(element1).perform();
		
		driver.findElement(By.xpath("//h4[normalize-space()='Certifcate Center']")).click();
		
		boolean Awards= driver.findElement(By.xpath("//h4[normalize-space()='Certifcate Center']")).isDisplayed();
        if(Awards) {
			
			System.out.println("Awards is present");
			}
		else {
			System.out.println("Awards is Not present");
		
		}
		 try {
	         Thread.sleep(3000);
	     } catch (InterruptedException e) {
	         e.printStackTrace();
	}
		 }
	
	@Test(priority = 7)
    public  void certificate_center() throws InterruptedException {
        // Set up the WebDriver
       
      /*  WebDriverWait wait = new WebDriverWait(driver, 10);
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

        // Navigate to Learning page
        driver.findElement(By.xpath("//a[normalize-space()='Learning']")).click();

        // Navigate to Awards page
        //driver.findElement(By.xpath("//a[contains(text(),'Awards')]")).click();*/

        // Navigate to Certificate Center page
        driver.findElement(By.xpath("//h4[normalize-space()='Certifcate Center']")).click();

        // Count and click on each certificate link using a for loop
        driver.findElements(By.xpath("//*[@id=\"root\"]/div/div"));

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[3]//div[3]//button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[5]//div[3]//button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[6]//div[3]//button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[7]//div[3]//button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[8]//div[3]//button[1]")).click();
        Thread.sleep(3000);
        
        
        driver.navigate().back()   ;    
    }
	
	@Test(priority = 8)
	public void Learning1() {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0, 0)");
	    WebElement learningLink = driver.findElement(By.xpath("//a[normalize-space()='Learning']"));
	    learningLink.click();
         
	    js.executeScript("window.scrollBy(0, 3240.5)");
	    
	}


@Test(priority = 9)
public void Footer() throws InterruptedException {


// Find the footer element
WebElement footer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[1]"));
List<WebElement> links = footer.findElements(By.tagName("a"));
int count = links.size();
System.out.println("Number of links in the footer is: " + count);

Thread.sleep(3000);
}		
	
	
@Test(priority = 10)
public static void LearningFooter() throws InterruptedException {
WebElement footer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[1]"));
List<WebElement> links = footer.findElements(By.tagName("a"));
int count_company = links.size();
System.out.println("Number of links in the footer is: " + count_company);

int count = 0;

for (int j = 0; j < count_company; j++) {
    
    footer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[1]"));
    List<WebElement> linksnew = footer.findElements(By.tagName("a"));

    linksnew.get(j).click();


    Thread.sleep(5000);

    String title = driver.getTitle();
    System.out.println("The title of the page is: " + title);
    

    if (title.contains("Oops, something lost")) {
        System.out.println("404, Found the broken link");
        count++;
    }

 
    if (j == 0) {
    
        driver.navigate().back();
        driver.navigate().back();
    } else if (j == 1) {
    	
        WebElement learningLink = driver.findElement(By.xpath("//a[contains(text(),'Learning')]"));
        learningLink.click();
        Thread.sleep(5000); 
    } else {
    	
        driver.navigate().back();
    }

    Thread.sleep(4000);
}
}

@Test(priority = 11)
public void GetFooterText() throws InterruptedException {

String footerText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[1]")).getText();
System.out.println("Text for footer: " + footerText);
Thread.sleep(3000);
driver.navigate().back();
driver.quit();
}

}