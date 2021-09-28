//5-e.Sort an array of strings is used command line arguments


//How to run this program 
output: javac Lab5e.java
        java Lab5e python java c sql
        before sorting strings
        java
        python 
        c 
        sql
        after sorting strings
        c 
        java
        python
        sql

import java.util.*;
class Lab5e
{
public static void main(String args[])
{
System.out.println("before sorting strings");
 for(int i=0;i<args.length;i++)
 System.out.println(args[i]);
 Arrays.sort(args);
 System.out.println("after sorting");
 for(int i=0;i<args.length;i++)
 System.out.println(args[i]);
}
}


