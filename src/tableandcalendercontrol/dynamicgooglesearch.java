package tableandcalendercontrol;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicgooglesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("swaraj");
	List<WebElement> list=	 driver.findElements(By.xpath("//ul[@class='erkvQe']//li/descendant::div[@class='sbl1']"));
	for(int i=0;i<list.size();i++){
	String searchlist=	list.get(i).getText();
	System.out.println(searchlist);
	if(searchlist.contains("swaraj mazda")){
		list.get(i).click();
		break;
	}
	
	}
	}

}
