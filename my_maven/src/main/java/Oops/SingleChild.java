package Oops;

public class SingleChild extends SingleParent {
	public void add()
	{
		System.out.println("Addition of two variable "+(a+b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingleChild obj1=new SingleChild();
obj1.print();
obj1.add();
	}

}
