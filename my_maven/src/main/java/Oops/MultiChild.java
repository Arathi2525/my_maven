package Oops;

public class MultiChild extends MultiParent
{
public void mul()
{
	int d=30;
	int h=55;
	int m=d*h;
	System.out.println("multiplication : "+m);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiChild ob=new MultiChild();
ob.mul();
ob.add();
ob.details();
System.out.println(ob.Rollno);
	}

}
