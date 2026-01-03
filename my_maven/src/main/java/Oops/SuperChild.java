package Oops;

public class SuperChild extends SuperParent
{
	String h="arathi";
	public SuperChild(String r)
	{
		super();
		System.out.println(r);
	}
	public void display()
	{
		System.out.println(h);
		System.out.println(super.s);//super.variable -variable calling from parentclass
		super.add();//super.method 
	}

public static void main(String[] args) {
		SuperChild ob=new SuperChild("hello");
		ob.display();
		
	
}


}