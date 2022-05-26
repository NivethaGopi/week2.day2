package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		 driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Phone']")).click();
		 driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneNumber']")).sendKeys("9874563210");
		 driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		 Thread.sleep(5000);
		 String ID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		 System.out.println(ID);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[4]")).click();
		 driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();
		 driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(ID);
		 driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		 driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div")).isDisplayed();
		//driver.close();

	}

}
