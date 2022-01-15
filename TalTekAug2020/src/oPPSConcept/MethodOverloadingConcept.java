package oPPSConcept;

public class MethodOverloadingConcept {

	public static void main(String[] args) {
		MethodOverloadingConcept mo = new MethodOverloadingConcept();
		
		mo.load1(10, null);
		


	}
	
	
	public void load1(){
		
		System.out.println("First method ");
	}
	
	public void load1(int a){
		
		System.out.println("Second method ");
	}

	public void load1(int a, int b){
		
		System.out.println("Third method ");
	}
	public void load1(int a, String b){
		
		System.out.println(b);
	}

}
