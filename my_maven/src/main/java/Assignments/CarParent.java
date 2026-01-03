package Assignments;

public class CarParent extends VehicleGrandParent
{
int tire;
public CarParent(String colour,int tire)
{
	super("kia");
	this.tire=tire;
	System.out.println(colour);
}
}
