package kj.java;

import java.util.ArrayList;
import java.util.Iterator;

public class App1 {
	public App1(Builder builder) {
		
	}
	public static class Builder {
		private final String name;
		private final Integer age;
		private int height = 0;
		private int weight = 0;
		public Builder(String name, Integer age){
			this.name = name;
			this.age = age;
		}
		public Builder height(int val){
			height = val;
			return this;
		}
		public Builder weight(int val){
			weight = val;
			return this;
		}
		public App1 build(){
			return new App1(this);
		}
	}
}
