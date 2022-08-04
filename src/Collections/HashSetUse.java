package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUse {

	public static void main(String[] args) {
		
		HashSet Hs= new HashSet();
		Hs.add("Joey");                    //0
		Hs.add("How You Doin?");           //1
		Hs.add('J');                       //2
		Hs.add(66);                        //3
		Hs.add(null);                      //4   Only one null value can be added  
		Hs.add("Joey");                    //5   Duplicate value will not be added
		Hs.add(null);                      //6
		
	
		System.out.println(Hs);
		System.out.println(Hs.size());
		System.out.println(Hs.contains('J'));
		System.out.println(Hs.isEmpty());
		System.out.println(Hs);
		System.out.println(Hs.remove('J'));
		System.out.println(Hs);
		System.out.println("=================");
		
		Iterator I= Hs.iterator();
		while (I.hasNext()) 
		{
			System.out.println(I.next());
		}
		System.out.println("=================");
		
		for (Object o:Hs) 
		{
			System.out.println(o);
		}
		System.out.println("===============");
		
		Hs.clear();
		System.out.println(Hs);
		System.out.println(Hs.isEmpty());
		
		

		
		
		
		

	}

}
