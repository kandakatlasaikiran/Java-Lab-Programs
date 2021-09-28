//Lab-16
//Write a program to implement finals, blank finals, final methods and final class. Write observations.

import java.util.*;
final class circle
{
 final double PI=3.14;
 final double r;
 circle(double r)
 {
  this.r=r;
 }
 final void area()
 {
  double a=r*r*PI;
  System.out.println(" the area of circle is "+a);
 }
}
class Lab16a
{
 public static void main(String args[])
 {
  circle c=new circle(6);
  c.area();
 }
}