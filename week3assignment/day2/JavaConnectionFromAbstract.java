package week3assignment.day2;

public class JavaConnectionFromAbstract extends MySqlConnection{
	
	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate() : interface-> abstract class -> Concrete class");
		
	}
	@Override
	public void executeQuery() {
		System.out.println("executeQuery() : abstract class -> Concrete class");
		
	}
	
	public void executedb() {
		System.out.println("executedb() : Concrete class");
		
	}

	public static void main(String[] args) {
		JavaConnectionFromAbstract ab= new JavaConnectionFromAbstract();
		ab.connect();
		ab.disconnect();
		ab.executedb();
		ab.executeUpdate();
		ab.executeQuery();
	}

}
