package Exception;

public class SampleException 
{
int a;
int b=10;
public void add()
{
	try 
	{
	System.out.println(b/a);
}
	catch(Exception e1)//exception means predefined class 
	{
		System.out.println("Exception handled");
		System.out.println(e1);
	}
	finally
	{
		System.out.println("Finally block");
	}
}
	public static void main(String[] args)
	{
		
		SampleException ob=new SampleException();
		System.out.println("Before exception");
		ob.add();//after exception occur code not execute
		System.out.println("After exception");
		
	}

}
