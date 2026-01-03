package Oops;

public class HierChild1 extends HierParent
{
public static void mul()
{
	int j=90;
	int k=5;
	System.out.println("Multiplication of two numbers  :" +(j*k));	
}
	
public static void main(String[] args) {
	
	HierChild1.mul();
	HierParent.add();
}
}
