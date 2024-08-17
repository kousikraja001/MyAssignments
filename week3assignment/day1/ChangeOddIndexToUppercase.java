package week3assignment.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String s = "changeme";
		char[] str=s.toCharArray();
		int length= str.length;
		System.out.println("Length of the string: " +length);
		for (int i = 0; i < str.length ; i++) {
			
			if (i%2 != 0) {
				
				char up = Character.toUpperCase(str[i]);
				System.out.print(up);	
			}
			else {
				System.out.print(str[i]);
			}
		}
	}
}
