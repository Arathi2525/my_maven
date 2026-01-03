package Assignments;//average of 3 int and float number using methodoverloading

class Average
{
public void add(int a,int b,int c)
{
System.out.println(a+b+c/3);
}
public void add(float d,float e,float f)
{
System.out.println(d+e+f/3);
}	
public static void main (String args[])
{
Average ob=new Average();
ob.add(10,20,30);
ob.add(2.4f,5.6f,6.3f);
}
}
