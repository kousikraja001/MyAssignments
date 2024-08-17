package week3assignment.day1;

public class LoginTestData3 extends TestData{
	
	public void viewLead() {
		System.out.println("Hierarchial child class-createLead");
		
	}
	

	public static void main(String[] args) {
		// Hierarchial inheritance 
		LoginTestData3 w = new LoginTestData3();
		w.enterCredentials();
		w.navigateToHomePage();
		w.viewLead();

	}

}
