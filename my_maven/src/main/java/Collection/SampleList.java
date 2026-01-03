package Collection;
                                               //List interface
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleList
{

	public static void main(String[] args) 
	{
List ob=new ArrayList();//List interface
ob.add(5);
ob.add("Hello");
ob.add("267.456d");
System.out.println(ob);

//generic

List ob1=new ArrayList<String>();
ob1.add("apple");
ob1.add("kiwi");
ob1.add("banana");
ob1.add("orange");
System.out.println(ob1);

ob.remove(1);
System.out.println(ob);

ob.remove("Hello");
System.out.println(ob);

List<String> ob2=new ArrayList();
ob2.add("earth");
ob2.add("globe");
System.out.println(ob2);

ob1.addAll(ob2);
System.out.println(ob1);

ob.removeAll(ob);
System.out.println(ob);

System.out.println(ob1.get(2));

System.out.println(ob1.size());


boolean s=ob1.contains("apple");//
boolean s1=ob2.contains("globe");
System.out.println(s);
System.out.println(s1);
	
boolean s2=ob1.isEmpty();
System.out.println(s2);

Iterator it=ob1.iterator();//classname ob=ob.iterator()
while(it.hasNext())
{
	System.out.println(it.next());
}

it.remove();
System.out.println(ob1);
	
	}

}
