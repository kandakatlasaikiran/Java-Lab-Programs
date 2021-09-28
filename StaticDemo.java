//10th-program
/*Write a Java program that counts the number of objects created by using static variable and static method.*/

class Demo
 {
  static int a=0;

  static
 {
  System.out.println("Static Block");
 }

 Demo()
 {
  a++;
 }

 static void display()
 {
  System.out.println("static Method");
  System.out.println(a);
 }
}

 class StaticDemo
 {
  public static void main(String args[])
  {
   Demo obj1=new Demo();
   Demo obj2=new Demo();
   Demo obj3=new Demo();
   Demo obj4=new Demo();
   Demo.display();
 }
}