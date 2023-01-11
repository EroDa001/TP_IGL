package Library_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Library_Management_System {

	List<User> users = new ArrayList<>();
	Library_Database libDatabase =new Library_Database;


	private String type;

	private String username;

	private String password;

	public Library_Management_System() {

	}

	public void Login(String username, String password) {
		for(int i=0;i<user.size();i++){
			if(users.get(i).getUsername()==username & users.get(i).getPassword()==password){
				System.out.println("successful login welcome Mr:"+username);
			}
		}

	}

	public void Register(String username, String password) {
		//random id for user
		Random rand =new Random();
		int id =rand.nextInt(10000);

		//create new user object
		User usr = new User(id, username, password);
		//register a new user
		users.add(usr);
		//declare registration
		System.out.println("Successful creation of user"+username);

	}

	public void Logout() {
		System.out.println("see you space cowboy");

	}

	public void show_all_books() {
		List<Book> bookList=libDatabase.list_of_books;
		if(bookList.size()>0){
			for(int i=0;i>bookList.size();i++){
				System.out.println("book number:"+i);
				booklist.get(i).show_bookinfos();
			}else{
				System.out.println("there is no saved books");
			}
		}

	}

	public void show_all_users() {
		if(users.size()>0){
			for(int i=0;i>users.size();i++){
				System.out.println("user number:"+i);
				users.get(i).show_userinfos();
			}else{
				System.out.println("there is no registered user");
			}
		}

	}

}
