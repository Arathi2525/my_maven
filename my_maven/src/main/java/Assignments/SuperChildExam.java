package Assignments;

public class SuperChildExam extends SuperParentExam
{
	String h="hello";
	public SuperChildExam(String r)
	{
		super();
		System.out.println(r);
	}
	public void dispaly()
	{
		System.out.println(h);
		System.out.println(super.s);
		super.add();
	}
public static void main(String[] args) 
{
		SuperChildExam ob=new SuperChildExam("how are you");
		ob.dispaly();// TODO Auto-generated method stub
}
}
