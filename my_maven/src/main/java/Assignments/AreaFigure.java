package Assignments;

class AreaFigure
{
public void area(float r)
{
double pi=3.14d;
double f=pi*r*r;
System.out.println("area of circle : "+f);
}
public void area(int l,int b)
{
	int area=l*b;
	System.out.println("area of rectangle :"+area);
}
public void area(int a)
{
	int g=a*a;
	System.out.println("area of square :"+g);
}
public static void main(String args[])
{
AreaFigure ob=new AreaFigure();
ob.area(4.2f);
ob.area(5,10);
ob.area(6);
}
}