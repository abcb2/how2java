package kj.java;

public class App2 {
	public App2() {
		
	}
	public static void main(String[] args){
		StaticKlass staticKlass = new StaticKlass();
		staticKlass.hello();

		App2 app2 = new App2();
		NonStaticKlass nonstaticKlass = app2.new NonStaticKlass();
		nonstaticKlass.hello();
	}

	static class StaticKlass {
		public void hello(){
			System.out.println(StaticKlass.class.getName());
		}
	}
	class NonStaticKlass {
		public void hello(){
			System.out.println(NonStaticKlass.class.getName());
		}
	}
}
