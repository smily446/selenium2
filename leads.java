package neta;

import java.awt.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {
    
    public static void main(String[] args) {
        String baseUrl = "https://livec.outgrow.in/iphone-1";
        System.setProperty("webdriver.chrome.driver","D:\\seleniumjarfiles\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get(baseUrl);
               
    Random rand = new Random(); 
             
             // Generate random integers in range 0 to 999 
            
       
                driver.manage().window().maximize();
                for(int i=0;i<2;i++) {
                	 int rand_int1 = rand.nextInt(1000); 
                     
                     
                     // Print random integers 
                     System.out.println("Random Integers: "+rand_int1); 
              
                driver.manage().deleteAllCookies();
                driver.findElement(By.xpath("//*[@id=\"icon_prefix0\"]")).sendKeys("test"+rand_int1);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
              
                driver.findElement(By.xpath("//*[@id=\"icon_prefix1\"]")).sendKeys("test"+rand_int1+"@email.com");
                driver.findElement(By.xpath("//*[@id=\"landingBtn\"]")).click();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//*[@id=\"5dbbc7d29e76380016f5eb57\"]")).sendKeys("This is alphanumeric"+rand_int1);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//*[@id=\"5dbbc7d29e76380016f5eb57\"]/i")).click();
                
                driver.findElement(By.xpath("//*[@id=\"5dbbc7d29e76380016f5eb58\"]")).sendKeys("77"+rand_int1);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
              
                driver.findElement(By.xpath("//*[@id=\"5dbbc7d29e76380016f5eb58\"]/i")).click();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.navigate().refresh();
                }
  //driver.navigate().forward();
  //driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
  //driver.findElement(By.xpath("//*[@id=\"hlb-view-cart-announce\"]")).click();
    }
}