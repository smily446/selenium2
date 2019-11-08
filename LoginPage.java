package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	public static WebDriver driver;
	public static WebDriverWait  wait;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Unirely\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://v2.unirely.com/login");
        
        //Synchronize by time's
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         wait = new WebDriverWait(driver, 10);
        
         
//       driver.findElement(By.xpath("//a[contains(@href='forget-password')]/@href")).click();
        
         login();
//         forgotPassword();
//           signup();
	
	}
	
	public static void login(){
		driver.findElement(By.id("text")).sendKeys("isha@test-student.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.className("btn1")).click();

		WebDriverWait wait = new WebDriverWait(driver,20);
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("user-profiles")));
		driver.findElement(By.className("user-profiles")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("fa-power-off")));
		driver.findElement(By.className("fa-power-off")).click();
		}

	
    public static void forgotPassword() {
    	
//		wait.until(ExpectedConditions.elementToBeSelected(By.id("text")));
//    	 driver.findElement(By.partialLinkText("forget")).click();
    	driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div[3]/div[2]/a/span")).click();
	    driver.findElement(By.id("text")).sendKeys("ishajoshi208@gmail.com");
//	    driver.findElement(By.linkText("Back to Login")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-forget-password/div/div/div[2]/form/div[1]/div[2]/div/a/span")));
	    driver.findElement(By.xpath("/html/body/app-root/app-forget-password/div/div/div[2]/form/div[1]/div[2]/div/a/span")).click();
	}
    
    public static void signup() {
    	
    	driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div[7]/a/span")).click();
        driver.findElement(By.id("fullname")).sendKeys("automate test");
        driver.findElement(By.id("username")).sendKeys("automate@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.id("confirmPassword")).sendKeys("12345");
        driver.findElement(By.id("phone")).sendKeys("987653345678");
        
    }
    
	


}
