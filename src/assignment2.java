import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/forou/Downloads/chromedriver_99/ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
WebElement table =driver.findElement(By.id("product"));
System.out.println(table.findElements(By.tagName("tr")).size());
System.out.println(table.findElements(By.tagName("th")).size());
List <WebElement> tablecontent =table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));		
System.out.println(tablecontent.get(2).getText());		
		
	}

}
