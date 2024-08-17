package week3assignment.day1;

public class LoginTestData2 extends LoginTestData{
	
	public void createLead() {
		System.out.println("multilevel and hybrid inheritance child class-createLead");
		
	}
	

	public static void main(String[] args) {
		//multilevel and hybrid inheritance 
		LoginTestData2 q = new LoginTestData2();
		q.enterCredentials();
		q.navigateToHomePage();
		q.enterUsername();
		q.enterPassword();
		q.createLead();

	}

}
