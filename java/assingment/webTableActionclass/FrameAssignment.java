package webTableActionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
				driver.switchTo().defaultContent();
		//count the number of frame in page
		List<WebElement> ifm = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + ifm.size());
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		driver.switchTo().defaultContent();
		driver.close();

			
		}
		

	}
