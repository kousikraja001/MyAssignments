package week2assignment.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxOperations {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");  // loads the given url - > goes to the website
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click basic checkbox
		driver.findElement(By.xpath("//div[@class='card']//span[@class='ui-chkbox-label']")).click();
		
		//click notification checkbox
		driver.findElement(By.xpath("//div[@class='card'][2]//span[@class='ui-chkbox-label']")).click();
		
		//validate alert
		String alert =driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		
		if (alert.contains("Checked")) {
			System.out.println("The text in alert is" +alert);
		}
		
		//click language
		driver.findElement(By.xpath("//div[@class='card'][3]//td[1]")).click();
		
		//tri-state option
		driver.findElement(By.xpath("//div[@class='card'][4]//div[@id='j_idt87:ajaxTriState']")).click();
		
		//toggle switch
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']/div[2]")).click(); 
		
		//check chechbox is enabled
		WebElement checkbox = driver.findElement(By.xpath("//span[text()='Disabled']"));
		boolean isenabled = checkbox.isSelected();
		System.out.println(isenabled);
	
        if (isenabled) {
            System.out.println("The checkbox is enabled");
        } else {
            System.out.println("The checkbox is disabled");
        }
		
        
        //selecting multiple choice
        driver.findElement(By.xpath("//form[@id='j_idt87']/div/div[2]/div[3]/div")).click();
        System.out.println("multi choice");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul/li[4]/div/div[2]")).click();
        System.out.println("1st option");
        
        driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul/li[2]/div")).click();
        System.out.println("2nd option");
        Thread.sleep(2000);
        
        boolean m = driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//input[@aria-checked='true']")).isSelected();
        
        //System.out.println(m);
        
        if (m) {
        	System.out.println("Istanbul is selected");
			
		}
        
        boolean t = driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//li[@data-item-value='London']//input[@aria-checked='true']")).isSelected();
        // System.out.println(t);
        if (t) {
        	System.out.println("London is selected");
			
		}
      
		driver.close();

	}

}
