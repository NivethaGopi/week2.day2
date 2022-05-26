package week2.day2;

import java.awt.datatransfer.SystemFlavorMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Email']")).click();
		 driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']")).sendKeys("xxxx@gmail.com");
		 driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		 Thread.sleep(5000);
		 //String name = driver.findElement(By.linkText("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		 //System.out.println(name);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		 String FirstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(FirstName);
		 driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Duplicate Lead']")).click();
		 //System.out.println("Title of the page is: "+ driver.getTitle());
		 if (driver.getTitle().contains("Duplicate Lead"))
		 {
			 System.out.println("Title of the page is: "+ driver.getTitle());
		 }
		 else
			 System.out.println("Unable to get title");
		 driver.findElement(By.className("smallSubmit")).click();
		 String Fname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(Fname);
		if (Fname==FirstName)
		{
			System.out.println("Duplicated name and Captured name are same");
		}
		else
			System.out.println("Both are not same");
		//driver.close();	 

	}

}
