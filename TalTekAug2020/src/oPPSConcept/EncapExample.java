package oPPSConcept;

public class EncapExample {
	
//	int a;
//	
//	public void thisconcept(int a){
//		this.a=a;
//		System.out.println(a);
//	}
//
//	
//	public static void main(String[] args) {
//		
//		EncapExample exp=new EncapExample();
//		exp.thisconcept(10);
//		System.out.println("Class level variable value :"+exp.a);
//	}
	
	private int money;
	private int pin;
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
