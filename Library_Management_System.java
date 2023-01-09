package Library_Management;

import java.util.ArrayList;
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

	}

	public void Logout() {

	}

	public void show_all_books() {

	}

	public void show_all_users() {

	}

}
