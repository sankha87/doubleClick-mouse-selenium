package doubleClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouse5{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		WebElement e = driver.findElement(By.name("q"));
		e.sendKeys("abcdefgh");
		Actions act = new Actions(driver);
		act.doubleClick(e).perform();
		
	}
}
