package package1;

public class MethodReturnConcept {

	public static void main(String[] args) {
		
		MethodReturnConcept mc=new MethodReturnConcept();
		mc.test1();
		mc.test2(499,500);
		test2(45345,56546);
		test3("string",56);
		
	}
	
	public void test1(){
		
		System.out.println(20+300);
	}
	
	public static void test2(int a,int b){
		
		System.out.println(a+b);
	}
	
	public static void test3(String a,int b){
		
		System.out.println(a+b);
	}
}
