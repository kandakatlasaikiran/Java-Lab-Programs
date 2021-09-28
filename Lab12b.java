import java.util.Scanner;
import java.io.*;
class callbyreference
{
int a,b;
	 void read(callbyreference c)
	{
	          c.a=c.a+10;
                  c.b=c.b+10;
	}
}
class Lab12b
{
public static void main(String args[])
{
callbyreference c=new callbyreference();
System.out.println("Enter two numbers:");
Scanner sc=new Scanner(System.in);
c.a=sc.nextInt();
c.b=sc.nextInt();
System.out.println("before the a and b values are"+c.a+","+c.b);
c.read(c);
System.out.println("after the a and  b values are"+c.a+","+c.b);
}
}