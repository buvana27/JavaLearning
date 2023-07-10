package webTableActionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		WebElement findElement = driver.findElement(By.xpath("//div[@id=\"resizable\"]//div[3]"));
		act.dragAndDropBy(findElement,30,50).perform();
		Thread.sleep(1000);
		driver.quit();

	}

}
