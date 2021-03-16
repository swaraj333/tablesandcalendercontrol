package tableandcalendercontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLunit_Driver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		System.out.println("title before loging::"+ driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(2000);

		System.out.println("after login, title is:===" + driver.getTitle());
	}

}
