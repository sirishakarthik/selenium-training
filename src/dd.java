import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class dd {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\forou\\Downloads\\chromedriver_101\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//div/ul/li[5]")).click();
		js.executeScript("document.getElementById('user_login').value='admin';");
		// driver.findElement(By.id("user_login")).sendKeys("admin");
		js.executeScript("document.getElementById('user_password').value='IndiaTeam#2020';");
		// driver.findElement(By.id("user_password")).sendKeys("IndiaTeam#2020");
		driver.findElement(By.name("commit")).click();

		// WebElement dd = driver.findElement(By.name("brand"));

		// Select option = new Select(dd);
		// option.selectByVisibleText("BMW");
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\forou\\Downloads\\logo1.png");
		FileUtils.copyFile(file, destfile);

	}

}
