package week3assignment.day1;

public class ReverseOddWords {

    public static void main(String[] args) {
        String text = "I am a software tester";
        String[] words = text.split(" ");
      //System.out.println(words.toString());
        
        // Iterate over each word and reverse the odd-positioned ones
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { // odd-indexed words
            	
            	String value=words[i];
        		char ch[] = value.toCharArray();
            	for (int j = ch.length-1; j >= 0; j--) {
            		System.out.print(ch[j]);
				}
            }
            
            else {
            	
				System.out.print(words[i]);
			}
            System.out.print(" ");
        }

    }
}

