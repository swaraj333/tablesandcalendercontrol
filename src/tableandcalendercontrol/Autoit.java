package tableandcalendercontrol;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/swaraj/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("D:\\autoitfileuploadscript.exe");
		Thread.sleep(3000);
		

	}

}
