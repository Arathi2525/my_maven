package Exception;

public class ExceptionThrow 
{
public static void display(int age)
{
	try
	{
	if(age<18)
	{
		throw new ArithmeticException("not eligible");
	}
	else
	{
		System.out.println("eligible");
	}
	}
	catch(Exception w)
	{
		System.out.println("exceptionhandled");
		System.out.println(w);
	}
}
	public static void main(String[] args)
	{
		ExceptionThrow.display(15);
	
		
	}

}
