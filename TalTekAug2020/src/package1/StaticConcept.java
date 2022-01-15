package package1;

public class StaticConcept {
	
	static int a=10;
	int b=20;

	public static void main(String[] args) {
		
		StaticConcept sc=new StaticConcept();
		System.out.println( "This is main method");
		test1();
		sc.test2();
		sc.test1();
		System.out.println(a);
		System.out.println(sc.b);
		
		
	}
	
	public static void test1(){
		int c=40;
		System.out.println("This is a static method "+c+a);
	}
	
	public void test2(){
		
		System.out.println("This is a non static method "+a+b);
	}

}
