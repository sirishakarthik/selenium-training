import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowns {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/forou/Downloads/chromedriver_101/ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	String url=	driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
	System.out.println(url);
	  HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
	  conn.setRequestMethod("HEAD");
	  conn.connect();
	  int response= conn.getResponseCode();
	  System.out.println(response);
		//driver.findElement(By.cssSelector("a[href='/windows']")).click();
	//	driver.findElement(By.linkText("Click Here")).click();
	//	System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
 
	//Set <String> windowhandles=	driver.getWindowHandles();
	//Iterator<String> it= windowhandles.iterator();
	//String parentwindow=it.next();
	//String childwindow=it.next();
	
	//System.out.println (driver.switchTo().window(childwindow).getTitle());
		
	 

	//	System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		// driver.findElement(By.cssSelector("a[aria-label='SN']")).click();
		// Set<String> windows = driver.getWindowHandles();
		// Iterator<String> it = windows.iterator();
		// String parentId = it.next();
		// String childId = it.next();
		// TargetLocator childRef = driver.switchTo();
		// childRef.window(childId);
		// driver.findElement(By.cssSelector("a[alt='Service']")).click();
		// Actions a =new Actions(driver);
		// a.moveToElement(driver.findElement(By.cssSelector("input.demo-header-input"))).click().keyDown(Keys.SHIFT).sendKeys("new").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
		// driver.findElement(By.cssSelector("input.demo-header-input")).click();

	}

}
