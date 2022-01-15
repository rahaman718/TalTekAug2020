package Package2;

public class MainClass {

	public static void main(String[] args) {

		publicMethod();
		privateMethod();
		protectedMethod();
		defaultmethod();

	}
	
	
	public static void publicMethod(){
		
		System.out.println("This is public method");
	}
	
	private static  void privateMethod(){
		
		System.out.println("This is private method");
	}
	
	protected static void protectedMethod(){
		
		System.out.println("This is protected method");
	}
	
	static void defaultmethod(){
		
		System.out.println("Default method");
	}

}
