package tableandcalendercontrol;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class hashmapinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:/Users/swaraj/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	System.out.println(getcredentialsmap().get("chinna"));
		String credentials=getcredentialsmap().get("chinna");
	String x=	credentials.split(":")[0];
	//System.out.println(x);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(getusername("customer"));
		driver.findElement(By.name("password")).sendKeys(getpassword("customer")); 
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		
		
	}
	public static HashMap<String,String> getcredentialsmap(){
		HashMap<String,String> usermap=new HashMap<String,String>();
		usermap.put("customer", "swaraj:swaraj");
		usermap.put("admin", "rahul879:gfghhfgf");
		return usermap;
	}
	public static String getusername(String role){
		String User_credential=getcredentialsmap().get(role);
	return	User_credential.split(":")[0];
	}
	public static String getpassword(String role){
		String User_credential=getcredentialsmap().get(role);
	return	User_credential.split(":")[1];
	}
}
