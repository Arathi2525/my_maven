package Exception;

public class NullException 
{
String s=null;
public void display()
{
	try
	{
	System.out.println(s.length());
	}
	catch(Exception a)
	{
		System.out.println("exception handled");
		System.out.println(a);
	}
	finally
	{
		System.out.println("Finally block");
	}
}
	public static void main(String[] args) 
	{
		NullException ob=new NullException();
		ob.display();
}

}
