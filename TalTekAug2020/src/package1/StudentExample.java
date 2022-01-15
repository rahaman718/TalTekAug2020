package package1;

public class StudentExample {

	public static void main(String[] args) {

		//int mark;
		int mark=studentMark(20,30);
		if(mark>=60){
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}

		System.out.println(unlimited(34,55,66));
		
	}

	
	public static int studentMark(int sub1,int sub2){
		
		int result=sub1+sub2;
		return result;
	}
	
	
	public static int unlimited(int...a){
		int result = 0;
		if(a!=null & a.length>1){
			
			for(int i=0;i<a.length;i++){
				
				result=result+a[i];
			}
		}
		
		return result;
	}
	
}
