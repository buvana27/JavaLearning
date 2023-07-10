package webTableActionclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealSolution {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@class='labelIcon']/following-sibling::span"))).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		Thread.sleep(2000);
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		String shoescount=count.replaceAll("[^0-9]", "");
		System.out.println("Total number of shoes count :"+shoescount);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//ul[@class=\"sort-value\"]/li[2])")).click();
		WebElement silder1 = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll left-handle')]"));
	    WebElement silder2 = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll left-handle')]/following-sibling::a[1]"));
		Thread.sleep(2000);
		act.dragAndDropBy(silder1, 58, 0).release().perform();
		act.dragAndDropBy(silder2, -55, 0).release().perform();
		Thread.sleep(2000);
		WebElement ranger1 = driver.findElement(By.xpath("//input[@name='fromVal']"));
		ranger1.clear();
		ranger1.sendKeys("900");
		WebElement ranger2 = driver.findElement(By.xpath("//input[@name='toVal']"));
		ranger2.clear();
		ranger2.sendKeys("1200");
		driver.findElement(By.xpath("(//div[@class='price-input']/following-sibling::div)[2]")).click();
		act.moveToElement(driver.findElement(By.xpath("//img[@class='product-image wooble']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.className("payBlkBig")).getText();
		System.out.println("Price of the product :"+price);
		Thread.sleep(2000);
		String discount = driver.findElement(By.xpath("//span[@class=\"percent-desc \"]")).getText();
		System.out.println("Price of the discount :"+discount);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./sshort/snap.jpg");
		FileUtils.copyFile(screenshotAs, file);
		driver.close();
		
	}
	

}
