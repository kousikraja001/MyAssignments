package week2assignment.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("local");//first name local 
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Selenium");//department 
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("front end testing");//description
		driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input[@id='createLeadForm_primaryEmail']")).sendKeys("testing6429@gmail.com");//email
		
		WebElement emt = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));//state
		Select opt = new Select(emt);
		opt.selectByVisibleText("New York");
		
		//click create lead button
		
		driver.findElement(By.name("submitButton")).click();
		
		
		System.out.println("Lead is created");
		
		
		driver.findElement(By.xpath("//a[text()='Qualify Lead']//following::a[contains(text(),'Edit')]")).click();
		
		driver.findElement(By.name("description")).clear();//clear the data in descri[tion
		
		driver.findElement(By.name("importantNote")).sendKeys("automation tester");//important note
		
		driver.findElement(By.name("submitButton")).click();// click update button
		
		////div[@id='_G9107__body']//input[@name='submitButton']
		
		System.out.println("Lead is updated");
		
		String title = driver.getTitle();
		if(title.contains("View Lead"))
		{
			System.out.println("Tile is "+title);
		
		}else {
			System.out.println("title is not correct");
		}
			
		driver.close();

	}

}
