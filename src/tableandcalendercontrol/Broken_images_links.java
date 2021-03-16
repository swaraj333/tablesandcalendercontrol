package tableandcalendercontrol;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_images_links {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  List<WebElement>  linklist=driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of full list of images and links---->"+linklist.size());
	List<WebElement> activelinks= new ArrayList<WebElement>();
	List<WebElement> brokenlinks= new ArrayList<WebElement>();

	for(int i=0;i<linklist.size();i++)
	{
	String url=	linklist.get(i).getAttribute("href");
	System.out.println(url);
	if(url !=null && (! url.contains("javascript")))
	{
		activelinks.add(linklist.get(i));
	}
		}
	System.out.println("size of active links and images--->"+activelinks.size());
	for(int j=0;j<activelinks.size();j++){
		HttpURLConnection connection=(HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response=connection.getResponseMessage();
		int responsecode=connection.getResponseCode();
		connection.disconnect();
		if (responsecode>=400) {
			brokenlinks.addAll(activelinks.get(j).getAttribute("href"));
			System.out.println(brokenlinks);
			//System.out.println(activelinks.get(j).getAttribute("href")+"is a broken link");
			
		}
		else {
			//System.out.println(activelinks.get(j).getAttribute("href")+"is a valid link");
		}
		//System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
		
		
	}
	}
}
