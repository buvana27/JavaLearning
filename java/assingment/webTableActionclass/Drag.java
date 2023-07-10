package webTableActionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/drag.xhtml");
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
	   Actions act=new Actions(driver);
	   act.dragAndDropBy(findElement, 80, 30).perform();
	}

}
