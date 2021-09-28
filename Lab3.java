//Lab-3
/*Write a program to perform the following operations on single dimensional array.
a) Find minimum and maximum elements.
b) Sum of the elements.
c) Sort given list of number.
d) Search for an element.
e) Remove duplicates.
*/

import java.util.*;
class lab3
{
  int a[],n;
  lab3()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the size of array");
    n=s.nextInt();
    a=new int[n];
    System.out.println(" enter elements for array:");
    for(int i=0;i<n;i++)
    {
     a[i]=s.nextInt();
    }
  }
  void display()
  {
    System.out.println("elements in array:");
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
  void minmax()
  {
    int max=a[0],min=a[0];
    for(int i=0;i<n;i++)
    {
     if(max<=a[i])
     {
      max=a[i];
     }
     else if(min>=a[i])
     {
      min=a[i];
     }
    }
    System.out.println("maximum element is:"+max);
    System.out.println("minimum element is :"+min);
  }
  void sum()
  {
    int sum=0;
    for(int i=0;i<n;i++)
    {
      sum=sum+a[i];
    }
     System.out.println("sum of array elements are:"+sum);
  }
  void sort()
  {
   int t;
   for(int i=0;i<n;i++)
   {
    for(int j=i+1;j<n;j++)
    {
     if(a[i]>a[j])
     {
       t=a[i];
       a[i]=a[j];
       a[j]=t;
     }
    }
   }
   System.out.println("after sorting the elements");
  }
   void search()
   {
    int f=0;
    Scanner s=new Scanner(System.in);
    System.out.println("enter search element");
    int ele=s.nextInt();
    for(int i=0;i<n;i++)
    {
     if(ele==a[i])
     {
      f=1;
      break;
     }
    }
    if(f==1)
    {
     System.out.println("element is found");
    }
     else
     {
      System.out.println("element is not found");
     }
   }
   void dup()
   {
    System.out.println("after removing duplicate");
    for(int i=0;i<n;i++)
    {
     for(int j=i+1;j<n;j++)
     {
       if(a[i]==a[j])
       {
         for(int k=j;k<n-1;k++)

             a[k]=a[k+1];

           n--;
           j--;
         
       }
     }
    }
   }
    public static void main(String args[])
    {
      lab3 ob=new lab3();
      ob.display();
      ob.minmax();
      ob.sum();
      ob.sort();
      ob.display();
      ob.search();
      ob.dup();
      ob.display();
    }
} 

