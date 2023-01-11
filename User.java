package Library_Management;

public class User {

	private String id;

	private String username;

	private String password;

	public User() {

	}

	public User(int id, String username, String password) {
		this.id=id;
		this.username=username;
		this.password=password;

	}

	public void Verify() {

	}

	public void CheckAccount() {

	}

	public void get_book_info() {

	}

	public void show_userinfos() {
		System.out.println("username :"+username+"password :"+password);

	}

	public void getUsername() {
		return username;

	}

	public void getPassword() {
		return password;

	}

}
