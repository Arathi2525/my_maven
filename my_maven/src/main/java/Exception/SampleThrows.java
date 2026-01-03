package Exception;

public class SampleThrows 
{
	public static void display(int age) throws LicenseException
	{
		
		if(age<18)
		{
			throw new LicenseException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
		
	}

public static void main(String args[]) 
{
try {
	SampleThrows.display(15);
} catch (LicenseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();// printStackTrace() used as predefined method for printing
}	
}

}