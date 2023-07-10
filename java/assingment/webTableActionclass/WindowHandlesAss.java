package webTableActionclass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlesAss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		Set<String> whs = driver.getWindowHandles();
		List<String> whl=new ArrayList<String>(whs);
		driver.switchTo().window(whl.get(1));
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
System.out.println(driver.getTitle());
driver.switchTo().window(whl.get(0));
System.out.println(driver.getTitle());
Thread.sleep(1000);
driver.quit();

	}

}
