package week3assignment.day1;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
    	String text = "We learn Java basics as part of java sessions in java week1" ;
		int count = 0;

		String[] txt = text.split(" ");
		//System.out.println(txt);
		
		for (int i = 0; i < txt.length; i++) {
			
			for (int j = i+1; j < txt.length; j++) {
				
				if (txt[i].equalsIgnoreCase(txt[j])) {
					
					txt[j] = ""; //duplicate value as empty string
					count++;
				}
			}
		}

        // Print the modified string
        if (count > 0) {
        	System.out.println("duplicate count is "+count);
        	//System.out.println(" string :" +txt);
            System.out.println("Modified string: ");
            for (String txt1 : txt) {
                if (txt1.contains("")) 
                {
                    System.out.print(txt1 + " ");
                }
            }
        } 
    }
}
