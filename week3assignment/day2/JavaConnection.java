package week3assignment.day2;

public class JavaConnection implements DatabaseConnection{
	@Override
	public void connect() {
		
		System.out.println("connect");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}

	public static void main(String[] args) {
		
	JavaConnection ob = new JavaConnection();
	ob.connect();
	ob.disconnect();
	ob.executeUpdate();
		
	}

}
