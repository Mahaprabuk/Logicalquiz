package mypack;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage_Class {

    ChromeDriver driver; // Declare driver at class level

    @BeforeTest
    public void common() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://quiz.logicalmindsitsolutions.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    @Test(priority=1)
    public void LKG() throws InterruptedException {
    	String LKG =	driver.findElement(By.xpath("//div[@class='grade-list-item blue1-bdr']")).getText();
		System.out.println("text for LKG ;  "  + LKG);
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1000);
		WebElement clickLKG = driver.findElement(By.xpath("//div[@class='grade-module blue1-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
		clickLKG.click();
		Thread.sleep(1000); 
		WebElement classes = driver.findElement(By.xpath("//div[@class='card']"));
		List<WebElement> links = classes.findElements(By.tagName("a"));
		int count_support = links.size();
		 System.out.println("Number of links in the classes is: " + count_support);
		
		    for (int j = 0; j < count_support; j++) {
		        WebElement footer1 = driver.findElement(By.xpath("//div[@class='card']"));
		        List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

		        linksnew.get(j).click();
		        Thread.sleep(1000);
		        
		        WebElement clickQuiz = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button"));
				clickQuiz.click();
				Thread.sleep(1000);
				 
		      /*  String title = driver.getTitle();
		        System.out.println("the title of the page is " + title);

		        if (title.contains("Oops, something lost")) {
		            System.out.println(" 404, Found the broken links");
		            count++;
		        }  */

		        driver.navigate().back();
		       
		        
		    }   
		        
		
		 String LKG1 =	driver.findElement(By.xpath("//div[@class='card']")).getText();
		System.out.println("text for LKG ;  "  + LKG1);
		Thread.sleep(1000); 
		
		  driver.navigate().back();
		        
    }
    
    @Test(priority=2)
    public void UKG() throws InterruptedException {
        String UKG = driver.findElement(By.xpath("//div[@class='grade-list-item blue2-bdr']")).getText();
        System.out.println("text for LKG ;  " + UKG);
        
        

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1000);

        WebElement clickUKG = driver.findElement(By.xpath("//div[@class='grade-module blue2-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
        clickUKG.click();

        WebElement classes = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div"));
        List<WebElement> links = classes.findElements(By.tagName("a"));
        int count_support = links.size();
        System.out.println("Number of links in the classes is: " + count_support);

        
        for (int j = 0; j < count_support; j++) {
            WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div"));
            List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

            linksnew.get(j).click();
            Thread.sleep(1000);

            WebElement clickQuiz = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button"));
            clickQuiz.click();
            Thread.sleep(1000);

          /*  String title = driver.getTitle();
            System.out.println("the title of the page is " + title);

            if (title.contains("Oops, something lost")) {
                System.out.println(" 404, Found the broken links");
                count++;
            } */

            driver.navigate().back();
        }
       

        // Scroll back to the top
        String UKG1 = driver.findElement(By.xpath("//div[@class='card']")).getText();
        System.out.println("text for UKG ;  " + UKG1);
        Thread.sleep(1000);
        // driver.quit(); // Commenting out quitting the driver here
        
        driver.navigate().back();
    }
    
    
    
    @Test(priority=3)
    public void class1() throws InterruptedException {
    	String Class1 =	driver.findElement(By.xpath("//div[@class='grade-module blue3-bdr']")).getText();
		System.out.println("text for Class1 ;  "  + Class1);
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1000);
		WebElement click = driver.findElement(By.xpath("//div[@class='grade-module blue3-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
		click.click();
		Thread.sleep(1000); 
		WebElement classes = driver.findElement(By.xpath("//div[@class='container']"));
		List<WebElement> links = classes.findElements(By.tagName("a"));
		int count_support = links.size();
		 System.out.println("Number of links in the classes is: " + count_support);
		 
		    for (int j = 0; j < count_support; j++) {
		        WebElement footer1 = driver.findElement(By.xpath("//div[@class='container']"));
		        List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

		        linksnew.get(j).click();
		        Thread.sleep(1000);
		        
		        WebElement clickQuiz = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button"));
				clickQuiz.click();
				Thread.sleep(1000);
				 
		      /*  String title = driver.getTitle();
		        System.out.println("the title of the page is " + title);

		        if (title.contains("Oops, something lost")) {
		            System.out.println(" 404, Found the broken links");
		            count++;
		        }*/

		        driver.navigate().back();
		       
		    }   
		        
		
		 String Class1a =	driver.findElement(By.xpath("//div[@class='container']")).getText();
		System.out.println("text for Class1 ;  "  + Class1a);
		Thread.sleep(1000); 
		
		 driver.navigate().back();
		
    }
    @Test(priority=4)
    public void class2() throws InterruptedException{
    	
		String Class1 =	driver.findElement(By.xpath("//div[@class='grade-module blue4-bdr']")).getText();
		System.out.println("text for Class1 ;  "  + Class1);
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1000);
		WebElement click = driver.findElement(By.xpath("//div[@class='grade-module blue3-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
		click.click();
		Thread.sleep(1000); 
		WebElement classes = driver.findElement(By.xpath("//div[@class='container']"));
		List<WebElement> links = classes.findElements(By.tagName("a"));
		int count_support = links.size();
		 System.out.println("Number of links in the classes is: " + count_support);
		 
		    for (int j = 0; j < count_support; j++) {
		        WebElement footer1 = driver.findElement(By.xpath("//div[@class='container']"));
		        List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

		        linksnew.get(j).click();
		        Thread.sleep(1000);
		        
		        WebElement clickQuiz = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button"));
				clickQuiz.click();
				Thread.sleep(1000);
				 
		  /*      String title = driver.getTitle();
		        System.out.println("the title of the page is " + title);

		        if (title.contains("Oops, something lost")) {
		            System.out.println(" 404, Found the broken links");
		            count++;
		        } */

		        driver.navigate().back();
		        
		    }   
		        
		
		 String Class2 =	driver.findElement(By.xpath("//div[@class='container']")).getText();
		System.out.println("text for Class2 ;  "  + Class2);
		Thread.sleep(1000); 
		
		        
		 driver.navigate().back();

		
		
    }
    
    @Test(priority=5)
       public void class3() throws InterruptedException{
    	  

		String Class3 =	driver.findElement(By.xpath("//div[@class='grade-module blue5-bdr']")).getText();
		System.out.println("text for Class1 ;  "  + Class3);
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
     scroll.executeScript("window.scrollBy(0, 700)");
     Thread.sleep(1000);
		WebElement click = driver.findElement(By.xpath("//div[@class='grade-module blue3-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
		click.click();
		Thread.sleep(1000); 
		WebElement classes = driver.findElement(By.xpath("//div[@class='container']"));
		List<WebElement> links = classes.findElements(By.tagName("a"));
		int count_support = links.size();
		 System.out.println("Number of links in the classes is: " + count_support);
		 
		    for (int j = 0; j < count_support; j++) {
		        WebElement footer1 = driver.findElement(By.xpath("//div[@class='container']"));
		        List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

		        linksnew.get(j).click();
		        Thread.sleep(1000);
		        
		        WebElement clickQuiz = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button"));
				clickQuiz.click();
				Thread.sleep(1000);
				 
		       /*	 String title = driver.getTitle();
		        System.out.println("the title of the page is " + title);

		        if (title.contains("Oops, something lost")) {
		            System.out.println(" 404, Found the broken links");
		            count++;
		        }*/

		        driver.navigate().back();
		        
		        
		    }   
		        
		
		 String Class3a =	driver.findElement(By.xpath("//div[@class='container']")).getText();
		System.out.println("text for Class2 ;  "  + Class3a);
		Thread.sleep(1000); 
		
		        
		 driver.navigate().back();

	 
    }
       @Test(priority=6)
           public void class4() throws InterruptedException{
 	
        	   String Class4 =	driver.findElement(By.xpath("//div[@class='grade-module blue6-bdr']")).getText();
       		System.out.println("text for Class1 ;  "  + Class4);
       		
       		JavascriptExecutor scroll = (JavascriptExecutor) driver;
               scroll.executeScript("window.scrollBy(0, 500)");
               Thread.sleep(1000);
               scroll.executeScript("window.scrollBy(0, 800)");
       		WebElement click = driver.findElement(By.xpath("//div[@class='grade-module blue3-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
       		click.click();
       		Thread.sleep(1000); 
       		WebElement classes = driver.findElement(By.xpath("//div[@class='container']"));
       		List<WebElement> links = classes.findElements(By.tagName("a"));
       		int count_support = links.size();
       		 System.out.println("Number of links in the classes is: " + count_support);
       		 
       		    for (int j = 0; j < count_support; j++) {
       		        WebElement footer1 = driver.findElement(By.xpath("//div[@class='container']"));
       		        List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

       		        linksnew.get(j).click();
       		        Thread.sleep(1000);
       		        
       		        WebElement clickQuiz = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button"));
       				clickQuiz.click();
       				Thread.sleep(1000);
       				 
       		     /*   String title = driver.getTitle();
       		        System.out.println("the title of the page is " + title);

       		        if (title.contains("Oops, something lost")) {
       		            System.out.println(" 404, Found the broken links");
       		            count++;
       		        }*/

       		        driver.navigate().back();
       		        
       		    }   
       		        
       		
       		 String Class4a =	driver.findElement(By.xpath("//div[@class='container']")).getText();
       		System.out.println("text for Class2 ;  "  + Class4a);
       		Thread.sleep(1000); 
       		
       		        
       		
       	 driver.navigate().back();
        	   
 }
 
           @Test(priority=7)
           public void class5() throws InterruptedException{
 	
        	   String Class5 =	driver.findElement(By.xpath("//div[@class='grade-module blue6-bdr']")).getText();
       		System.out.println("text for Class1 ;  "  + Class5);
       		
       		JavascriptExecutor scroll = (JavascriptExecutor) driver;
               scroll.executeScript("window.scrollBy(0, 500)");
               Thread.sleep(1000);
               scroll.executeScript("window.scrollBy(0, 1000)");
       		WebElement click = driver.findElement(By.xpath("//div[@class='grade-module blue3-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
       		click.click();
       		Thread.sleep(1000); 
       		WebElement classes = driver.findElement(By.xpath("//div[@class='container']"));
       		List<WebElement> links = classes.findElements(By.tagName("a"));
       		int count_support = links.size();
       		 System.out.println("Number of links in the classes is: " + count_support);
       		
       		    for (int j = 0; j < count_support; j++) {
       		        WebElement footer1 = driver.findElement(By.xpath("//div[@class='container']"));
       		        List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

       		        linksnew.get(j).click();
       		        Thread.sleep(1000);
       		        
       		        WebElement clickQuiz = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button"));
       				clickQuiz.click();
       				Thread.sleep(1000);
       				 
       		       /* String title = driver.getTitle();
       		        System.out.println("the title of the page is " + title);

       		        if (title.contains("Oops, something lost")) {
       		            System.out.println(" 404, Found the broken links");
       		            count++;
       		        }*/

       		        driver.navigate().back();
       		        
       		        
       		    }   
       		        
       		
       		 String Class5a =	driver.findElement(By.xpath("//div[@class='container']")).getText();
       		System.out.println("text for Class2 ;  "  + Class5a);
       		Thread.sleep(1000); 
       		
       		        
       		
       	 driver.navigate().back();
       		
        	   
 }
 
           @Test(priority=8)
          public void class6() throws InterruptedException{
 	  
        		String Class6 =	driver.findElement(By.xpath("//div[@class='grade-module blue6-bdr']")).getText();
        		System.out.println("text for Class1 ;  "  + Class6);
        		
        		JavascriptExecutor scroll = (JavascriptExecutor) driver;
                scroll.executeScript("window.scrollBy(0, 500)");
                Thread.sleep(1000);
                scroll.executeScript("window.scrollBy(0, 1000)");
        		WebElement click = driver.findElement(By.xpath("//div[@class='grade-module blue3-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
        		click.click();
        		Thread.sleep(1000); 
        		WebElement classes = driver.findElement(By.xpath("//div[@class='container']"));
        		List<WebElement> links = classes.findElements(By.tagName("a"));
        		int count_support = links.size();
        		 System.out.println("Number of links in the classes is: " + count_support);
        		 
        		    for (int j = 0; j < count_support; j++) {
        		        WebElement footer1 = driver.findElement(By.xpath("//div[@class='container']"));
        		        List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

        		        linksnew.get(j).click();
        		        Thread.sleep(1000);
        		        
        		        WebElement clickQuiz = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button"));
        				clickQuiz.click();
        				Thread.sleep(1000);
        				 
        		     /*   String title = driver.getTitle();
        		        System.out.println("the title of the page is " + title);

        		        if (title.contains("Oops, something lost")) {
        		            System.out.println(" 404, Found the broken links");
        		            count++;
        		        } */

        		        driver.navigate().back();
        		       
        		        
        		    }   
        		        
        		
        		 String Class6a =	driver.findElement(By.xpath("//div[@class='container']")).getText();
        		System.out.println("text for Class6 ;  "  + Class6a);
        		Thread.sleep(1000); 
        		
        		        
        		 driver.navigate().back();

        		
        		
 }
    
    
  
    
   // @Test(priority=9)
    public void class7() throws InterruptedException {
    	 String CLASS7 = driver.findElement(By.xpath("//div[@class='grade-list-item blue9-bdr']")).getText();
         System.out.println("text for LKG ;  " + CLASS7);

         JavascriptExecutor scroll = (JavascriptExecutor) driver;
         scroll.executeScript("window.scrollBy(0, 900)");
         Thread.sleep(1000);

         WebElement clickCLASS1 = driver.findElement(By.xpath("//div[@class='grade-module blue9-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
         clickCLASS1.click();

         WebElement classes = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
         List<WebElement> links = classes.findElements(By.tagName("a"));
         int count_support = links.size();
         System.out.println("Number of links in the classes is: " + count_support);

        
         for (int j = 0; j < count_support; j++) {
             WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div"));
             List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

             linksnew.get(j).click();
             Thread.sleep(1000);

             WebElement clickQuiz = driver.findElement(By.xpath("//button[normalize-space()='Start Quiz']"));
             clickQuiz.click();
             Thread.sleep(1000);

         /*    String title = driver.getTitle();
             System.out.println("the title of the page is " + title);

             if (title.contains("Oops, something lost")) {
                 System.out.println(" 404, Found the broken links");
                 count++;
             }*/

             driver.navigate().back();
         }
         

         // Scroll back to the top
         String UKG1 = driver.findElement(By.xpath("//div[@class='card']")).getText();
         System.out.println("text for UKG ;  " + UKG1);
         Thread.sleep(1000);
         // driver.quit(); // Commenting out quitting the driver here
         
         driver.navigate().back();
    }
    @Test(priority=10)
    public void class8() throws InterruptedException {
    	 String CLASS7 = driver.findElement(By.xpath("//div[@class='grade-list-item blue10-bdr']")).getText();
         System.out.println("text for class8 ;  " + CLASS7);

         JavascriptExecutor scroll = (JavascriptExecutor) driver;
         scroll.executeScript("window.scrollBy(0, 900)");
         Thread.sleep(1000);

         WebElement clickCLASS1 = driver.findElement(By.xpath("//div[@class='grade-module blue10-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
         clickCLASS1.click();

         WebElement classes = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
         List<WebElement> links = classes.findElements(By.tagName("a"));
         int count_support = links.size();
         System.out.println("Number of links in the classes is: " + count_support);

         
         for (int j = 0; j < count_support; j++) {
             WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
             List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

             linksnew.get(j).click();
             Thread.sleep(1000);

             WebElement clickQuiz = driver.findElement(By.xpath("//button[normalize-space()='Start Quiz']"));
             clickQuiz.click();
             Thread.sleep(1000);

         /*    String title = driver.getTitle();
             System.out.println("the title of the page is " + title);

             if (title.contains("Oops, something lost")) {
                 System.out.println(" 404, Found the broken links");
                 count++;
             }*/

             driver.navigate().back();
         }
         

         // Scroll back to the top
         String UKG1 = driver.findElement(By.xpath("//div[@class='container']")).getText();
         System.out.println("text for class8 ;  " + UKG1);
         Thread.sleep(1000);
         // driver.quit(); // Commenting out quitting the driver here
         
         driver.navigate().back();
    }
    @Test(priority=11)
    public void class9() throws InterruptedException {
    	 String CLASS9 = driver.findElement(By.xpath("//div[@class='grade-list-item blue11-bdr']")).getText();
         System.out.println("text for class8 ;  " + CLASS9);

         JavascriptExecutor scroll = (JavascriptExecutor) driver;
         scroll.executeScript("window.scrollBy(0, 1000)");
         Thread.sleep(1000);

         WebElement clickCLASS9 = driver.findElement(By.xpath("//div[@class='grade-module blue11-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
         clickCLASS9.click();

         WebElement classes = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
         List<WebElement> links = classes.findElements(By.tagName("a"));
         int count_support = links.size();
         System.out.println("Number of links in the classes is: " + count_support);

       
         for (int j = 0; j < count_support; j++) {
             WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
             List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

             linksnew.get(j).click();
             Thread.sleep(1000);

             WebElement clickQuiz = driver.findElement(By.xpath("//button[normalize-space()='Start Quiz']"));
             clickQuiz.click();
             Thread.sleep(1000);

             /*String title = driver.getTitle();
             System.out.println("the title of the page is " + title);*/

             /*if (title.contains("Oops, something lost")) {
                 System.out.println(" 404, Found the broken links");
                 count++;
             }*/

             driver.navigate().back();
             Thread.sleep(1000);
         }
         

         // Scroll back to the top
         String class9 = driver.findElement(By.xpath("//div[@class='container']")).getText();
         System.out.println("text for class8 ;  " + class9);
         Thread.sleep(1000);
         // driver.quit(); // Commenting out quitting the driver here
         
         driver.navigate().back();
    }
    
    @Test(priority=12)
    public void class10() throws InterruptedException {
    	 String CLASS10 = driver.findElement(By.xpath("//div[@class='grade-list-item blue12-bdr']")).getText();
         System.out.println("text for class8 ;  " + CLASS10);

         JavascriptExecutor scroll = (JavascriptExecutor) driver;
         scroll.executeScript("window.scrollBy(0, 1000)");
         Thread.sleep(1000);

         WebElement clickCLASS10 = driver.findElement(By.xpath("//div[@class='grade-module blue12-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
         clickCLASS10.click();

         WebElement classes = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
         List<WebElement> links = classes.findElements(By.tagName("a"));
         int count_support = links.size();
         System.out.println("Number of links in the classes is: " + count_support);

         
         for (int j = 0; j < count_support; j++) {
             WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
             List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

             linksnew.get(j).click();
             Thread.sleep(1000);

             WebElement clickQuiz = driver.findElement(By.xpath("//button[normalize-space()='Start Quiz']"));
             clickQuiz.click();
             Thread.sleep(1000);

             /*String title = driver.getTitle();
             System.out.println("the title of the page is " + title);*/

             /*if (title.contains("Oops, something lost")) {
                 System.out.println(" 404, Found the broken links");
                 count++;
             }*/

             driver.navigate().back();
             Thread.sleep(1000);
         }
         

         // Scroll back to the top
         String class10 = driver.findElement(By.xpath("//div[@class='container']")).getText();
         System.out.println("text for class8 ;  " + class10);
         Thread.sleep(1000);
         // driver.quit(); // Commenting out quitting the driver here
         
         driver.navigate().back();
    }
    @Test(priority=13)
    public void class11() throws InterruptedException {
    	 String CLASS11 = driver.findElement(By.xpath("//div[@class='grade-list-item blue13-bdr']")).getText();
         System.out.println("text for class8 ;  " + CLASS11);

         JavascriptExecutor scroll = (JavascriptExecutor) driver;
         scroll.executeScript("window.scrollBy(0, 1200)");
         Thread.sleep(1000);

         WebElement clickCLASS11 = driver.findElement(By.xpath("//div[@class='grade-module blue13-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
         clickCLASS11.click();

         WebElement classes = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
         List<WebElement> links = classes.findElements(By.tagName("a"));
         int count_support = links.size();
         System.out.println("Number of links in the classes is: " + count_support);

         
         for (int j = 0; j < count_support; j++) {
             WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
             List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

             linksnew.get(j).click();
             Thread.sleep(1000);

             WebElement clickQuiz = driver.findElement(By.xpath("//button[normalize-space()='Start Quiz']"));
             clickQuiz.click();
             Thread.sleep(1000);

             /*String title = driver.getTitle();
             System.out.println("the title of the page is " + title);*/

             /*if (title.contains("Oops, something lost")) {
                 System.out.println(" 404, Found the broken links");
                 count++;
             }*/

             driver.navigate().back();
             Thread.sleep(1000);
         }
         

         // Scroll back to the top
         String class11 = driver.findElement(By.xpath("//div[@class='container']")).getText();
         System.out.println("text for class8 ;  " + class11);
         Thread.sleep(1000);
         // driver.quit(); // Commenting out quitting the driver here
         driver.navigate().back();
    }
    
    @Test(priority=14)
    public void class12() throws InterruptedException {
    	 String CLASS12 = driver.findElement(By.xpath("//div[@class='grade-list-item blue14-bdr']")).getText();
         System.out.println("text for class8 ;  " + CLASS12);

         JavascriptExecutor scroll = (JavascriptExecutor) driver;
         scroll.executeScript("window.scrollBy(0, 1200)");
         Thread.sleep(1000);

         WebElement clickCLASS12 = driver.findElement(By.xpath("//div[@class='grade-module blue14-bdr']//button[@class='button-style'][normalize-space()='PLAY QUIZ']"));
         clickCLASS12.click();

         WebElement classes = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
         List<WebElement> links = classes.findElements(By.tagName("a"));
         int count_support = links.size();
         System.out.println("Number of links in the classes is: " + count_support);

         
         for (int j = 0; j < count_support; j++) {
             WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div"));
             List<WebElement> linksnew = footer1.findElements(By.tagName("a"));

             linksnew.get(j).click();
             Thread.sleep(1000);

             WebElement clickQuiz = driver.findElement(By.xpath("//button[normalize-space()='Start Quiz']"));
             clickQuiz.click();
             Thread.sleep(1000);

             /*String title = driver.getTitle();
             System.out.println("the title of the page is " + title);*/

             /*if (title.contains("Oops, something lost")) {
                 System.out.println(" 404, Found the broken links");
                 count++;
             }*/

             driver.navigate().back();
             Thread.sleep(1000);
         }
        
         System.out.println("This class finished");

         // Scroll back to the top
         String class12 = driver.findElement(By.xpath("//div[@class='container']")).getText();
         System.out.println("text for class8 ;  " + class12);
         Thread.sleep(1000);
         // driver.quit(); // Commenting out quitting the driver here
         
         driver.navigate().back();
         
    }





}