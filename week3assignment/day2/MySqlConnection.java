package week3assignment.day2; 

public abstract class MySqlConnection implements DatabaseConnection{

		
		public void connect() {
			System.out.println("connect(): interface-> abstract class");
			
		}
		public void disconnect() {
			System.out.println(" disconnect(): interface-> abstract class");
		}
		
		public abstract void executeQuery();

}
