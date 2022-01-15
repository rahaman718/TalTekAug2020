package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		List <String> st=new ArrayList<String>();
		st.add("stt");
		st.add("cc");
		st.add("dd");
		
		System.out.println(st.get(1));
		System.out.println(st);
		
		for(int i=0;i<st.size();i++){
			System.out.println(st.get(i));
		}
		
		
		//Using Iterator & example of While loop
		
		Iterator<String> it = st.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
