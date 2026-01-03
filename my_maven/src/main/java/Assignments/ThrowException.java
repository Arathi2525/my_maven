package Assignments;

public class ThrowException 
{
int acc_bal=6000;
public void bank()
{
	try
	{
		if(acc_bal<7000)
		{
		throw new ArithmeticException("balance is insufficient");	//if we are facing any exception that we need to give inside try and catch will handles this
		}
		else
		{
			System.out.println("balance is sufficient");
		}
		
	
	}
	
	catch(Exception a)
	{
		System.out.println("exception handled");
		System.out.println(a);
	}
}
	
	
	public static void main(String[] args) 
	{
	ThrowException ob=new ThrowException();
	ob.bank();
	System.out.println("After exception");
	
	}

}
