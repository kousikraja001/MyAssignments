package week2assignment.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");  // loads the given url - > goes to the website
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("test");//first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("acc2024kkr");//last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("acc2024kkr");//company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Selenium UI Automation Tester.");//title
		WebElement e = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select option = new Select(e);
		option.selectByValue("IND_SOFTWARE"); //dropdown 
		
		
		driver.findElement(By.className("smallSubmit")).click();//click submit
		System.out.println("Account created successfully");
		String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();//store the value in variable
		System.out.println("the given title in lead account creation is "+title);
		if(title.contains("Selenium UI Automation Tester."))//verify given title
		{
			System.out.println("title is correct");
			
		}
		else 
		{
			System.out.println("title is incorrect");
		}
		
		driver.close();	 

	}

}
