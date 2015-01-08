package kj.java;

import java.util.ArrayList;
import java.util.List;

public class App5 {

	public static void main(String[] args) {
		App5 app = new App5();
		List<User> users = new ArrayList<>();
		users.add(app.new User(3, "sabu"));
		users.add(app.new User(5, "goro"));
		users.add(app.new User(1, "ichiro"));
	}

	public class User {
		Integer id;
		String name;
		public User(Integer id, String name){
			this.id = id;
			this.name = name;
		}
	}
}
