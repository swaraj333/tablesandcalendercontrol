package tableandcalendercontrol;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngGmail {
	WebDriver driver;
//	@BeforeSuite
//	public void Invokewebdriver(){
//		System.setProperty("webdriver.chrome.driver","C:/Users/swaraj/Downloads/chromedriver_win32/chromedriver.exe");
//		 driver = new ChromeDriver();
			
	//}
//	@AfterSuite
//	public void killwebdriver(){
//			
//		try {
//			Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
//		} catch (IOException e) {
//				// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@BeforeTest
//	public void deletecookies(){
//		System.setProperty("webdriver.chrome.driver","C:/Users/swaraj/Downloads/chromedriver_win32/chromedriver.exe");
//		 driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
//		
//	}
//	@AfterTest
//	public void closebrowser(){
//		driver.quit();
//	}
//	@BeforeClass
//	public void lauchgmail(){
//		System.setProperty("webdriver.chrome.driver","C:/Users/swaraj/Downloads/chromedriver_win32/chromedriver.exe");
//		 driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
//		//driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//	}
//	@AfterClass
//	public void closegmail(){
//		driver.quit();
//}
	@BeforeMethod
	public void gmaillogin() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("swaraj.panjala");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		//Thread.sleep(5);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hustleloyalityrespect");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		}

    @AfterMethod
	public void gmaillogout(){
		driver.findElement(By.xpath("//span[@class='gb_xa gbii']")).click();
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
		driver.quit();

	}
	@Test(priority=1)	
	public void getTitle(){
		System.out.println(driver.getTitle());
	}
	@Test(priority=2)
	public void sendmail() throws InterruptedException{
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(5);
		driver.findElement(By.xpath("//textarea[@id=':r3']")).sendKeys("swaraj.panjala@gmail.com");
		driver.findElement(By.xpath("//input[@id=':ql']")).sendKeys("Gamailloginsample");
		driver.findElement(By.xpath("//div[@id=':rq']")).sendKeys("Hi this sample gmail test case");
		driver.findElement(By.xpath("//div[@id=':qb']")).click();
	}
}
