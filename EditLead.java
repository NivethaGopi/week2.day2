package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		 driver.findElement(By.xpath("//div[@class='x-tab-panel-bwrap']//input[@name='firstName']")).sendKeys("Nivetha");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		 System.out.println("Title of the page is: "+ driver.getTitle());
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Updated");
		 driver.findElement(By.name("submitButton")).click();
		 //System.out.println(driver.findElement(By.xpath("//span[contains(text()='Test Leaf')]")));
		 String Company = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println(Company);
		 if(Company.contains("Test Leaf"))
				 {
			 System.out.println("Company name is updated");
				 }
		 else
			 System.out.println("Company name is not updated");
		//driver.close();
		
		
	}

}
