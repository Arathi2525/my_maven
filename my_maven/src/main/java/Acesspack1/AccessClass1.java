package Acesspack1;

public class AccessClass1 {

	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;
	public static void add()
	{
		int h=50;
		int g=88;
		System.out.println("public " +(h+g));
	}
	private static void sub()
	{
		int l=40;
		int y=70;
		System.out.println("private "+ (l-y));
	}
	
protected static void mul()
{
 System.out.println("protected");
}
void print()
{
	System.out.println("default");
}
	public static void main(String[] args) 
	{
		AccessClass1 ob=new AccessClass1();
		System.out.println(ob.a);
		System.out.println(ob.b);//private only have access within the class
		System.out.println(ob.c);
		System.out.println(ob.d);
		AccessClass1.add();
		AccessClass1.sub();
		AccessClass1.mul();
		ob.print();
		
	}

}
//within the class accessbility