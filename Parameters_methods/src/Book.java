
public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private String copyright_date;
	private String description;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Book myBook = new Book();
		
	}
	
	public Book() {
		this.set_title("Football");
		System.out.println(this.get_title() + "\n");
		
		this.set_author("James Cameron");
		System.out.println(this.get_author() + "\n");
		
		this.set_publisher("Alejandro Garnacho \n");
		System.out.println(this.get_publisher());
		
		this.set_copyright_date("1/2/2022");;
		System.out.println(this.get_copyright_date() + "\n");
		
		System.out.println(this.description());
		
		
	}
	
	
	public void set_title(String title) {
		this.title = title;
		
	}
	
	public String get_title() {
		return title;
	}
	
	public void set_author(String author) {
		this.author = author;
	}
	
	public String get_author() {
		return author;
	}
	
	public void set_publisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String get_publisher() {
		return publisher;
	}
	
	public void set_copyright_date(String copyright_date) {
		this.copyright_date = copyright_date;
	}
	
	public String get_copyright_date() {
		return copyright_date;
	}
	
	public String description() {
		return "This book is about a famous young footballer which had \n"
				+ "a dream to become a pro foorballer he was only 18 years old where he \n"
				+ "made his debut to play for the first team. This book will talk about the player \n"+
				"and his adventures";
	}
	
	
	

}
