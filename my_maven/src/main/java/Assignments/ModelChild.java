package Assignments;

public class ModelChild extends CarParent
{
	int price;
	public ModelChild(int price)
	{
	super("red",4);
	this.price=price;
	System.out.println(price);
	System.out.println(super.tire);
	}
	public void item()
	{
		System.out.println("colours");
	}

	public static void main(String[] args) 
	{
	ModelChild ob=new ModelChild(100000);
    ob.item();

	}

}
