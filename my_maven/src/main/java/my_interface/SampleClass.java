package my_interface;

public class SampleClass implements SampleInterface
{
	public void add()
	{
		int h=50;
		int l=40;
		int s=h+l;
		System.out.println("add : "+s);
	}
	
	public void display()
	{
		System.out.println("interface/abstract method 1");;
	}
	public void show()
	{
		System.out.println("interface/abstract method 2");
	}

	public static void main(String[] args)
	{
	SampleClass ob=new SampleClass();
//SampleInterface ob1=new SampleClass();//when we create interface object we need to call classname as constructor
   //obj1.classMethod();
	//we cannot access the method of the class  
	ob.add();
	ob.display();
	ob.show();
	System.out.println("interace varaiable " + a);
	System.out.println("interace varaiable " + b);
	}
	

}
