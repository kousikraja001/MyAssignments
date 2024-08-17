package week3assignment.day1;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("child class-enterUsername");
		
	}
	
	public void enterPassword() {
		System.out.println("child class-enterPassword");
		
	}

	public static void main(String[] args) {
		//single or simple inheritance
		LoginTestData l = new LoginTestData();
		l.enterCredentials();
		l.navigateToHomePage();
		l.enterUsername();
		l.enterPassword();
		

	}

}
