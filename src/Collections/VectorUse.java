package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUse {

	public static void main(String[] args) {
		
		Vector V= new Vector();
		V.add("Pikachu");     //0
		V.add(45);            //1
		V.add(92.48f);        //2
		V.add('P');           //3
		V.add(null);          //4
		V.add(null);          //5
		
		System.out.println(V);
		System.out.println(V.capacity());
		System.out.println(V.size());
		System.out.println(V.isEmpty());
		System.out.println(V.contains(45));
		
		System.out.println(V.indexOf("Pikachu"));
		System.out.println(V.get(2));
		System.out.println(V.lastIndexOf("Pikachu"));
		V.add("Pi Ka Pi");
		V.remove(5);
		System.out.println(V);
		System.out.println(V.size());
        System.out.println("=========================");
        
        Iterator It= V.iterator();      //Printing all list data using Iterator
        while (It.hasNext()) {
        	System.out.println(It.next());
        }
        System.out.println("=========================");
        
        ListIterator Li= V.listIterator();   //Printing All list data using List Iterator
        while (Li.hasNext()) {
        	System.out.println(Li.next());
        }
        System.out.println("=========================");
        
        for (Object f:V) {                   //Printing All list data using ForEach Loop
        	System.out.println(f); 
        }
        System.out.println("=========================");
        
        Enumeration E= V.elements();         //Printing All list data using Enumeration(*Valid only for Vector class*)
        while (E.hasMoreElements()) {
        	System.out.println(E.nextElement());
        }
        System.out.println("=========================");
        
		

	}

}
