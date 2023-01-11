package Library_Management;

public class Book {

	private String title;

	private String author;

	private String ISBN;

	private String publisher;

	public Book() {

	}

	public Book(String title, String auther, String ISBN, String publisher) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		this.publisher=publisher;

	}

	public void show_info() {

	}

	public void Reservation_status() {}

	public void Feedback() {}

	public void Book_request() {}

	public void Renew_info() {

	}

	public void getTitle() {
		return title;
	}

	public void show_bookinfos() {
		System.out.println("Book Title:"+title);
		System.out.println("Book Author:"+author);
		System.out.println("Book ISBN:"+ISBN);
		System.out.println("Book Publisher:"+publisher);
		System.out.println("");

	}

}
