package Acesspack1;

public class AccessClass2 {

	public static void main(String[] args)
	{
		AccessClass1 ob=new AccessClass1();//previous class have no connection 
		System.out.println(ob.a);
		//System.out.println(ob.b);//within the package no accesbility for private
		System.out.println(ob.c);
		System.out.println(ob.d);	
		AccessClass1.add();
		//AccessClass1.sub();//private has no access
		AccessClass1.mul();
		ob.print();

	}

}
