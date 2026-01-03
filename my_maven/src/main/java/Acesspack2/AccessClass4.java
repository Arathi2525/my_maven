package Acesspack2;

import Acesspack1.AccessClass1;

public class AccessClass4 extends AccessClass1 {//after extends we can create new objectfor this class here we are using inheritance

	public static void main(String[] args) 
	{
		AccessClass4 ob1=new AccessClass4();
		System.out.println(ob1.a);
		//System.out.println(ob1.b);//within the package no accesbility for private
		System.out.println(ob1.c);
		//System.out.println(ob1.d);//default no access	
		AccessClass1.add();
		//AccessClass1.sub();
		AccessClass1.mul();
		//ob.print();

	}

}
// private and default different class and different package no accessbility