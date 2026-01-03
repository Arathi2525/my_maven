package Collection;

import java.util.ArrayList;                      //ArrayList class
import java.util.Iterator;

public class SampleCollection 
{
	

	public static void main(String[] args)
	{/*nongeneric*/
	ArrayList al=new ArrayList();//import package
	al.add("world");
	al.add(10);
	al.add(234.6f);
	System.out.println(al);

	/*generic*/
	ArrayList<String> bl=new ArrayList();
	bl.add("apple");
	bl.add("kiwi");
	bl.add("banana");
	bl.add("fruit");
	bl.add("strwbery");
	System.out.println(bl);
	
	bl.remove(1);
	System.out.println(bl);
	
	bl.remove("banana");
	System.out.println(bl);
	
	ArrayList<String> cl=new ArrayList();
	cl.add("hii");
	cl.add("hello");
	System.out.println(cl);
	
	bl.addAll(cl);
	System.out.println(bl);
	
	al.removeAll(al);
	System.out.println(al);

	
	System.out.println(bl.get(2));
	
	System.out.println(bl.size());
	
boolean s=bl.contains("apple");
boolean s1=bl.contains("ooo");
System.out.println(s);
System.out.println(s1);
	

boolean s2=bl.isEmpty();
System.out.println(s2);

Iterator it=bl.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
it.remove();//last element removed
System.out.println(bl);
	}

}