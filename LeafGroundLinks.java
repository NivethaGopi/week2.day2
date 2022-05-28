package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Link.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Go to Home Page")).click();
		 System.out.println("Title of the First HomePage is:" + driver.getTitle());
		 if(driver.getTitle().contains("TestLeaf"))
		 {
			 System.out.println("The Browser is redirected to HomePage");
		 }
		 else
			 System.out.println("The Browser is not redirected to HomePage");
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[contains(text(),'without clicking')]")).click();
		 driver.findElement(By.xpath("//label[text()='Click button to travel home page']/following-sibling::button[text()='Go to Home Page']")).getAttribute("href");
		 System.out.println("Title of the Second HomePage is:" + driver.getTitle());
		 //driver.navigate().back();
		 Thread.sleep(5000);
		 Point position = driver.findElement(By.id("position")).getLocation();
		 System.out.println("Position of the button: " + position);
		 String color = driver.findElement(By.id("color")).getCssValue("background-color");
		 System.out.println("Color of the button: " + color);
		 Dimension size = driver.findElement(By.id("size")).getSize();
		 System.out.println("Height and Width of the button: " + size);
		 driver.navigate().back();
		 driver.findElement(By.linkText("Verify am I broken?")).click();
		 String brokenPage = driver.findElement(By.tagName("h1")).getText();
		 System.out.println(brokenPage);
		 if(brokenPage.contains("404"))
		 {
			 System.out.println("The Page is Broken");
		 }
		 else
			 System.out.println("The Page is not Broken");
		 driver.navigate().back();
		 driver.findElement(By.xpath("//label[text()='(Interact with same link name)']/preceding-sibling::a")).click();
		 System.out.println("Title of the Third HomePage is:" + driver.getTitle());
		 driver.navigate().back();
		 driver.findElement(By.linkText("How many links are available in this page?")).click();
		 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 //driver.close();
		 
		 

	}

}
