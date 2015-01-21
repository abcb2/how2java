package kj.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App4 {
	public static void main(String[] args){
		App4 app = new App4();
		String[] lists = {"taro","jiro","saburo","jiro"};
		Set<User> users = new HashSet<User>(); 
		for(String name : lists){
			User user = app.new User(name);
			users.add(user);
		}
		
		Iterator<User> it = users.iterator();
		while(it.hasNext()){
			User u = it.next();
			System.out.println(u.name);
		}
		
//		TreeSet<String> dictionary = new TreeSet<>();
//		String[] lists = {"あいうえお","さしすせそ","かきくけこ","たちつてと"};
//		for(String str : lists){
//			dictionary.add(str);	
//		}
//		Iterator<String> it = dictionary.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		
	}
	public class User {
		String name;
		public User(String name){
			this.name = name;
		}
	}
}
