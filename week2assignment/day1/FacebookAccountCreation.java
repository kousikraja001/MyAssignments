package week2assignment.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");  // loads the given url - > goes to the website
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("test");///passing first name
		driver.findElement(By.name("lastname")).sendKeys("2024acc");//passing last name
		driver.findElement(By.name("reg_email__")).sendKeys("6720284287");// passing phone number
		driver.findElement(By.name("reg_passwd__")).sendKeys("testacoount@672028");// passing password
		
		WebElement e1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select opt1 = new Select(e1);
		opt1.selectByValue("31"); // passing brithday date
		
		WebElement e2 = driver.findElement(By.name("birthday_month"));
		Select opt2 = new Select(e2);
		opt2.selectByIndex(6); //passing brithday month 
		
		WebElement e3 = driver.findElement(By.name("birthday_year"));
		Select opt3 = new Select(e3);
		opt3.selectByVisibleText("2001"); //passing year 		
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click(); //gender
		//driver.findElement(By.xpath("//label[@id='u_9_4_gs']")).click(); //gender
		
		driver.findElement(By.name("websubmit")).click(); //click sign up
		
		System.out.println("Fackbook account created");
		
		driver.close();

	}

}
