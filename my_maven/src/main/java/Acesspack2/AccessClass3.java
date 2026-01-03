package Acesspack2;

import Acesspack1.AccessClass1;

public class AccessClass3 {

	public static void main(String[] args) 
	{
		AccessClass1 ob=new AccessClass1();//aggregation
		System.out.println(ob.a);//only public have access
		//System.out.println(obj.b);//within the package no accesbility for private
		//System.out.println(ob.c);//protected 
		//System.out.println(ob.d);	
		AccessClass1.add();
		//AccessClass1.sub();
		//AccessClass1.mul();
		//ob.print();
	

	}

}
