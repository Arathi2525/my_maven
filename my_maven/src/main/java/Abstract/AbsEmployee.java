package Abstract;

public abstract class AbsEmployee 
{
private int id;
private String name;
public void SetMethod(int id,String name)
{
this.id=id;
this.name=name;
}
public void GetMethod()
{
	System.out.println("employee id :"+id);
	System.out.println("employee name :"+name);
	}
public abstract void salary();//abstract method
}
