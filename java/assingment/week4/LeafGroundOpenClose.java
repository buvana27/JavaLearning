package assignment.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundOpenClose {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Open label and close window 
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> whopen = driver.getWindowHandles();
		for(String who:whopen) {
			System.out.println("window address for open label :"+who);
		}
		List<String>whlist=new ArrayList<String>(whopen);
		driver.switchTo().window(whlist.get(0));
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);

		//Open Multipe
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> wmul = driver.getWindowHandles();
		for (String whmul : wmul) {
			System.out.println("window address for open label :"+whmul);
		}
		List<String> win=new ArrayList<String>(wmul);
		driver.switchTo().window(win.get(0));
		for (int i = 1; i < win.size(); i++) {
			driver.switchTo().window(win.get(i));
			driver.close();

		}

		Thread.sleep(2000);
		//		for (int i = 1; i < whlist.size(); i++) {
		//			driver.switchTo().window(whlist.get(i));
		//			driver.close();
		//					}
		//	
		driver.quit();

	}

}
