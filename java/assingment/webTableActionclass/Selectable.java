package webTableActionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));


        Actions act =new Actions(driver);
		act.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item3)
		.click(item5)
		.click(item7)
		.keyUp(Keys.CONTROL)
		.perform();
	
		Thread.sleep(4000);
		driver.close();
	}

}
