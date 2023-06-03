package assingment.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();	
		driver.findElement(By.linkText("Create Lead")).click();	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		WebElement name = driver.findElement(By.id("createLeadForm_firstName"));
	    name.sendKeys("Buvaneshwari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test");
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		WebElement des = driver.findElement(By.id("createLeadForm_description"));
		des.sendKeys("test the application");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("buvi@gmail.com");
		WebElement st = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state=new Select(st);
		state.selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement cmp = driver.findElement(By.id("createLeadForm_companyName"));
		cmp.clear();
		cmp.sendKeys("TestLeaf1");
		WebElement Fname = driver.findElement(By.id("createLeadForm_firstName"));
		Fname.clear();
		Fname.sendKeys("Buvi");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
	}

}
