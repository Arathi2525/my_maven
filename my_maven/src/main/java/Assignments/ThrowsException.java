package Assignments;

public class ThrowsException
{
	public static void display() throws LowScoreException 
	{
		int score=29;
		
		if(score<40)
		{
			throw new LowScoreException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
public static void main(String args[]) 
{
    try {
			ThrowsException.display();
		} catch (Exception e) {
			
			System.out.println("handled");
			System.out.println(e);
		}
	
	}
}

