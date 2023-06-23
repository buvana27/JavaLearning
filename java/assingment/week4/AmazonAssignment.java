package assignment.week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement serbox = driver.findElement(By.id("twotabsearchtextbox"));
		serbox.sendKeys("oneplus 9 pro ");
		serbox.sendKeys(Keys.ENTER);
		String text = driver.findElement(By.xpath("//span[@class=\"a-price-whole\"][1]")).getText();
		String text1 =text.replaceAll(".00","");
		String text21 =text1.replaceAll("\\D","");
		int price=Integer.parseInt(text21);
		System.out.println("Frist displayed mobile price in Integer :"+price);
		String text2 = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Frist displayed mobile rating :"+text2);
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wh=new ArrayList<String>(windowHandles);
		driver.switchTo().window(wh.get(1));
		Thread.sleep(2000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File path=new File("./sshort/mobile.jpg");
		FileUtils.copyFile(screenshotAs, path);
		String text3 = driver.findElement(By.xpath("//div[@id=\"availability\"]/span")).getText();
		System.out.println(text3);
		driver.findElement(By.name("submit.add-to-cart")).click();
		Thread.sleep(5000);
		String subtotal = driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-price')]//span[1]")).getText();
		String subtotal1 =subtotal.replaceAll(".00","");
		String subtotal2 =subtotal1.replaceAll("\\D","");
		int sub=Integer.parseInt(subtotal2); 
		System.out.println("Total price in integer : "+sub);	
		if(sub==price) {
			driver.findElement(By.xpath("//span[text()='    Cart   ']/following::input")).click();
		}else {
			System.out.println("Total is mismatch");
		}
		driver.close();
	}
}
