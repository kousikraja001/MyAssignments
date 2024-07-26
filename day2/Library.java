package week1assignment.day2;


public class Library {
	
	public String addBook(String bookTitle) {
		return bookTitle;
		
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
		
	}

	public static void main(String[] args) {
		Library add =new Library();
		System.out.println(add.addBook("Book added successfully"));
		add.issueBook();


	}

}
