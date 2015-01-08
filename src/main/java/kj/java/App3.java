package kj.java;

import java.util.ArrayList;

public class App3 {
	public static void main(String[] args){
		String str = new Object(){
			public String hoge(String arg){
				System.out.println(arg);
				return arg + "dayo";
			}
		}.hoge("hello");
		System.out.println(str);
	}
}
