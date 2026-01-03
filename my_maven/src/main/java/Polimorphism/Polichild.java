package Polimorphism;

public class Polichild extends Poliparent 
{
@Override
public void print()//same method name 
{
	System.out.println("child method");
	super.print();//we can call parent method using super keyword
}

	public static void main(String[] args) 
	{
		Polichild ob=new Polichild();
		ob.print();
		
		//Poliparent ob1 =new Poliparent();
		//ob1.print();
	}


}
