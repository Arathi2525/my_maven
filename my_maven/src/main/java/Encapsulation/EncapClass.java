package Encapsulation;

public class EncapClass 
{
private int age;
private String name;
public void settermethod(int age,String name)//private variable modify or set we are using gettermethod
{
	this.age=age;
	this.name=name;
	if(age >=18)
	{
		System.out.println("you are elegible ");
	}	else {
		System.out.println("you are not elegible ");
	}

}
public void gettermethod()
{
	age=age*2;
System.out.println("age : "+age);
System.out.println("name : "+name);	
}
}
