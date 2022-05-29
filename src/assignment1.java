import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/forou/Downloads/chromedriver_99/ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");

		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		
//		driver.findElement(By.cssSelector("input[value='option2']")).click();
//		driver.findElement(By.cssSelector("input[value='option2']")).getText();
//		String opt=driver.findElement(By.cssSelector("input[value='option2']")).getText();
//		System.out.println(opt);
		WebElement selectedoption = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"));
		
		String checkboxVal = selectedoption.getText();
		
		System.out.println(checkboxVal);

		WebElement dd1 = driver.findElement(By.id("dropdown-class-example"));

		Select selct = new Select(dd1);
		selct.selectByVisibleText(checkboxVal);
		driver.findElement(By.id("name")).sendKeys(checkboxVal);
		driver.findElement(By.id("alertbtn")).click();
		String alerttxt= driver.switchTo().alert().getText();
		if(alerttxt.contains(checkboxVal)) {
			System.out.println("Success!");
			
		}
		else
		{
			System.out.println("Something went wrong!");
	
			
		}

	}

}
