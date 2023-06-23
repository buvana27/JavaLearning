package assignment.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement username=driver.findElement(By.id("username"));
username.sendKeys("demoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
driver.findElement(By.xpath("//a[text()=\"Merge Contacts\"]")).click();
driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
Set<String> windowHandles = driver.getWindowHandles();
List<String> wh=new ArrayList<String>(windowHandles);
for (String whl : wh) {
	
	//System.out.println(wh);
}
driver.switchTo().window(wh.get(1));
driver.findElement(By.xpath("//a[@class='linktext']")).click();
driver.switchTo().window(wh.get(0));
driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
Set<String> windowHandles1 = driver.getWindowHandles();
List<String> wh1=new ArrayList<String>(windowHandles1);
for (String whl1 : wh1) {
	
}
driver.switchTo().window(wh1.get(1));
driver.findElement(By.xpath("//a[text()='10923']")).click();
driver.switchTo().window(wh1.get(0));
driver.findElement(By.xpath("//a[@class=\"buttonDangerous\"]")).click();
driver.switchTo().alert().accept();
String title = driver.getTitle();
System.out.println(title);
driver.close();
	}

}
