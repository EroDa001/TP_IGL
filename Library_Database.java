package Library_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library_Database {

	List<Book> list_of_books =new ArrayList<>();

	public Library_Database() {

	}

	public void Add() {

		Scanner TappedValue = new Scanner(System.in); //create a Scanner
		System.out.println("Enter book title:");
		String title=TappedValue.nextLine(); //read title input
		System.out.println("Enter book author");
		String author=TappedValue.nextLine(); //read author
		System.out.println("Enter book ISBN:");
		String ISBN =TappedValue.nextLine(); //read ISBN input
		System.out.println("Enter book publisher:");
		String publisher = TappedValue.nextLine(); //read publisher input

		//create book object 
		Book book = new Book(title,author,ISBN,publisher);
		//insert book object
		list_of_books.add(book);
		System.out.println("added book succesfully");


	}

	public void Delete() {

		
	}

	public void Update() {

	}

	public void Display() {

	}

	public void Search(String bookTitle) {
		//search by book name
		for(int i=0;i<list_of_books.size();i++){
			if (list_of_books.get(i).getTitle==bookTitle){
				System.out.println("Search result:");
				list_of_books.get(i).show_bookinfos();
			}else {
				System.out.println("not found !");
			}
		}

	}

}
