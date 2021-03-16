package tableandcalendercontrol;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class gmail {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\browserdrivers\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("swaraj.panjala");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
	
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hustleloyalityrespect");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id=':r3']")).sendKeys("swaraj.panjala@gmail.com");
		//driver.findElement(By.xpath("//textarea[@id=':r3']")).click();
		driver.findElement(By.xpath("//input[@id=':ql']")).sendKeys("Gamailloginsample");
		driver.findElement(By.xpath("//div[@id=':rq']")).sendKeys("Hi this sample gmail test case");
		driver.findElement(By.xpath("//div[@id=':qb']")).click();
		driver.findElement(By.xpath("//span[@class='gb_xa gbii']")).click();
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();

	}

}
