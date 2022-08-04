package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUse {

	public static void main(String[] args) {
		
		LinkedList ll= new LinkedList();
		
		ll.add("Leo Messi");            //0
		ll.add(10);                     //1
		ll.add(30.30f);                 //2
		ll.add(null);                   //3
		ll.add(null);                   //4
		ll.add("Hala Madrid");          //5
		ll.add(10);                     //6
		
		
		System.out.println(ll);
		System.out.println(ll.size());    
		System.out.println(ll.isEmpty());  
		System.out.println(ll.contains(10));   
		System.out.println(ll.indexOf(10));    
		System.out.println(ll.lastIndexOf(10)); 
		System.out.println(ll.get(2));
		
		ll.add(4, "PSG");     //Adding list element on a particular index in between list
		ll.remove(5);
		System.out.println(ll);
		System.out.println("====================");
		
		Iterator I=ll.iterator();                    //Iterator use for printing Linkedlist
		while (I.hasNext()) 
		{                           
			System.out.println(I.next());
		}
		System.out.println("=====================");
		
		ListIterator li= ll.listIterator();          //ListIterator use for printing Linkedlist
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("======================");
		
		for (int i = 0; i<=ll.size()-1; i++) 
		{                                                   //ForLoop use for printing Linkedlist
			System.out.println(ll.get(i));
		}
		System.out.println("=======================");
		
		
		for (Object a:ll)                                   //ForEachLoop use for printing Linkedlist
		{
			System.out.println(a);
		}
		System.out.println("========================");

		

	}

}
