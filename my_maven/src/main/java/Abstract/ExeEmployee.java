package Abstract;

public class ExeEmployee extends AbsEmployee 
{
public void salary()
{
	System.out.println("Salary amount 500000");
}
	public static void main(String[] args) 
	{
	ExeEmployee ob=new ExeEmployee();
	ob.SetMethod(22,"Arathi");
	ob.GetMethod();
	ob.salary();
	}

}
