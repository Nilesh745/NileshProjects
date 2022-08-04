package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUse {

	public static void main(String[] args) {
		
        TreeSet ts= new TreeSet();
		
		ts.add("Deadpool");
		ts.add("Robert Downey Jr.");
		ts.add("The Dark Knight");
		ts.add("Interstellar");
		ts.add("Ryan Reynolds");
		ts.add("XXX");
		ts.add("aaa");
		ts.add("AAA");
		//ts.add(null);--> will throw nullpointer exception
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("abc"));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		
		Iterator it= ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object o:ts)
		{
			System.out.println(o);
		}


	}

}
