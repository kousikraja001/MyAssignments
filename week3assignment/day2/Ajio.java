package week3assignment.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(30)));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		WebElement txt =driver.findElement(By.xpath("//div[@class=' filter-container']//strong"));
		
		Thread.sleep(7000);
		System.out.println("the count is "+txt.getText());
		
		
		//prints displayed bags brands in the page
		System.out.println("The bag brands: ");
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='brand']"));
		for (int i = 0; i < list1.size(); i++) {
			String brd = list1.get(i).getText();
			System.out.println(brd);
		}
		
		
		//prints displayed names of the bags in the page
		System.out.println("The name of the bags: ");
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (int i = 0; i < list2.size(); i++) {
			String brd = list2.get(i).getText();
			System.out.println(brd);
		}
		
		driver.close();
	} 

}
