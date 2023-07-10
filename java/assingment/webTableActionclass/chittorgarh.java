package webTableActionclass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-striped table-hover w-auto\"]"));
		//row count
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		//col count
		List<WebElement> col = table.findElements(By.tagName("th"));
		System.out.println(col.size());
//						//header information
//						for(int i=1;i<=row.size();i++) {
//						String text = table.findElement(By.xpath("//table[contains(@class,'table table-bordered')]//tr[1]/th["+i+"]/a")).getText();
//						System.out.print(text+"    ");}
		//Security Name
		List<String> security=new ArrayList<String>();
		List<WebElement> Name = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//td[1]"));
		for(int i=0;i<Name.size();i++) {
			security.add(Name.get(i).getText());	
		}
		//security List
		//System.out.println("List of security name in table");
		//for(int i=0;i<security.size()-1;i++) {
		//	System.out.println(security.get(i));}
		Set<String> security1=new TreeSet<String>(security);
		if(security1.size()!=security.size()) {
			System.out.println("Dplicate available");
		}else

			System.out.println("No duplicate");
driver.close();
	}

}
