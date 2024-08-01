package week2assignment.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");  // loads the given url - > goes to the website
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("testmanager2024kkr");//account name
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");//description
		driver.findElement(By.id("numberEmployees")).sendKeys("1");//number of employees
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");//site name
		
		
		WebElement e1 = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select opt1 = new Select(e1);
		opt1.selectByValue("IND_SOFTWARE"); // industry dropdown 
		
		WebElement e2 = driver.findElement(By.name("ownershipEnumId"));
		Select opt2 = new Select(e2);
		opt2.selectByVisibleText("S-Corporation"); //ownership dropdown 
		
		WebElement e3 = driver.findElement(By.name("dataSourceId"));
		Select opt3 = new Select(e3);
		opt3.selectByValue("LEAD_EMPLOYEE"); //source dropdown 		
		
		WebElement e4 = driver.findElement(By.name("marketingCampaignId"));
		Select opt4 = new Select(e4);
		opt4.selectByIndex(6); //marketing Campaign dropdown
		
		WebElement e5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select opt5 = new Select(e5);
		opt5.selectByValue("TX"); //source dropdown 
		
						
		driver.findElement(By.className("smallSubmit")).click();//click submit
		System.out.println("Account created successfully");
		String a = driver.findElement(By.xpath("//span[contains(text(),'testmanager2024kkr')]")).getText();
		System.out.println("the account name is   "+a);
		if(a.contains("testmanager2024kkr"))//verify account name
		{
			System.out.println("account name is correct");
			
		}
		else 
		{
			System.out.println("account name is incorrect");
		}
		
		driver.close();		
	}

}
