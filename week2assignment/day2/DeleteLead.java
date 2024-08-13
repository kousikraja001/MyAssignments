package week2assignment.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");  // loads the given url - > goes to the website
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//ul[@class='sectionTabBar']//a[text()='Leads']")).click();//click leads
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//li[3]")).click();//click find leads
		driver.findElement(By.xpath("//div[@class='x-tab-strip-wrap']//li[2]")).click();//click phone
		WebElement phone = driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneNumber']"));
		phone.sendKeys("9876543210");
		driver.findElement(By.xpath("//table[@class='x-btn-wrap x-btn']//button[text()='Find Leads']")).click();//click find button
		System.out.println("found through phone number " +phone);
		
		String title = driver.getTitle();
		if(title.contains("Find Leads")) 
		{
			System.out.println("Tile is "+title);
		
		}else {
			System.out.println("title is not correct");
		}
		
		Thread.sleep(5000);
		
		String leadId=driver.findElement(By.xpath("//a[text()='14264']")).getText();
		System.out.println("leadid is "+leadId);
		driver.findElement(By.xpath("//a[text()='14264']")).click();//click the leadid hyperlink in the result
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();//click delete button
		System.out.println(leadId+ " is deleted");
		
		driver.findElement(By.xpath("//div[@id='left-content-column']//a[text()='Find Leads']")).click();//click find button
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		
		driver.findElement(By.xpath("//td[@class='x-panel-btn-td']//button[text()='Find Leads']")).click();//click find button
		Thread.sleep(2000);
		
		String norec = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		System.out.println(norec);
		
		if(norec.contains("No records to display"))
		{
			System.out.println("LeadId is deleted successfully");
        }
		else {
			System.out.println("LeadId is not deletion is not successful");
		}
		
		driver.close();
	}


}