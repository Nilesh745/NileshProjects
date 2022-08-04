package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUse {

	public static void main(String[] args) {
		
		ArrayList Al= new ArrayList();
		Al.add("Nilesh");  //0
		Al.add("26Mar-B"); //1
		Al.add(99);        //2
		Al.add(77.77f);    //3
		Al.add('A');       //4
		Al.add(null);      //5
		Al.add(null);      //6
		System.out.println(Al); 
		System.out.println(Al.size());
        System.out.println(Al.indexOf("Nilesh"));
        System.out.println(Al.lastIndexOf("Nilesh"));
        
        Al.set(4, 'N');
        System.out.println(Al);
        System.out.println(Al.isEmpty());
        System.out.println(Al.contains(77.77f));
        System.out.println(Al.get(0));
        System.out.println(Al);
        
        Al.add("Cristiano7");
        System.out.println(Al);
        Al.remove(5);
        System.out.println(Al);
        System.out.println("=========================");
        Iterator It= Al.iterator();
        while (It.hasNext()) {
        	System.out.println(It.next());
        }
        System.out.println("=========================");
        for(Object A:Al) {
        	System.out.println(A);
        }
        System.out.println("=========================");
        for(int i = 0; i<= Al.size()-1; i++) {
        	System.out.println(Al.get(i));
        }
        
        
        
		
		
	}

}
