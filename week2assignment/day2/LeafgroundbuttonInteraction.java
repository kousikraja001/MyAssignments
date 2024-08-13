package week2assignment.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundbuttonInteraction {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");  // loads the given url - > goes to the website
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		// click "Click and Confirm title."
		driver.findElement(By.xpath("//div[@class='card'][1]//span")).click();
		String db = driver.findElement(By.xpath("//div[@class='route-bar-breadcrumb'][1]")).getText();
		if (db.contains("Dashboard")) {
			System.out.println("title is correct: "+db);
		} else {
			System.out.println("title is not correct");
		}
		
		driver.navigate().back();//navigate to previous page
		
		
		// click "Click and Confirm title." is enabled or not. Here is Enabled method is used
		
		Boolean b=  driver.findElement(By.xpath("//div[@class='card'][2]/button")).isEnabled();
		if (b) {
			System.out.println("button is enabled");//true block
		} else {
			System.out.println("button is disabled");//false block
		}
		
		
		//size of the button
		Dimension size = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following-sibling::button")).getSize();
		System.out.println("size of submit button is "+size);
		
		
		//position of the button
		Point position = driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following-sibling::button")).getLocation();
		System.out.println("position of submit button is "+position);
		
		
		//save button color
		WebElement element = driver.findElement(By.xpath("//div[@class='card'][4]/button"));
		String c = element.getCssValue("background-color");
		System.out.println("Save button background-color is "+c);

		driver.close();
	}

}
