package Abstract;

public class ExecutionClass extends AbsClass
{
public void data()//to pass the defnition to abstract method
{
	System.out.println("abstarct method ");
}
public void print()
{
	int a=10;
	int b=30;
	System.out.println("adding "+(a+b));
}
	public static void main(String[] args) {
		ExecutionClass ob=new ExecutionClass();
		ob.print();
		ob.add();
		ob.data();
		
	}

}
