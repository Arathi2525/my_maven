package Oops;

public class HierChild2 extends HierParent
{
	String s="Sum";
	public static void sub()
	{
int l=26;
double d=23.78d;
double m=l-d;
System.out.println("Substraction of two number : "+m);
	}

	public static void main(String[] args) {
		HierChild2 obj=new HierChild2();
		System.out.println(obj.s);
		System.out.println(obj.u);
		HierChild2.sub();

		// TODO Auto-generated method stub
	}

}
