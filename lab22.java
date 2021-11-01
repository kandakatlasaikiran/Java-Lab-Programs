class mythread implements Runnable
{
    int s,min,hr,d;
    public void run()
    {
     try
     {
       for(int i=1;i<=24;i++)
       {
         min=0;
         for(int j=1;j<=60;j++)
         {
           s=0;
           for(int k=1;k<=60;k++)
           {
              Thread.sleep(1000);
              s++;
              System.out.println(s+"seconds");
              if(s==60)
              {
                min++;
                System.out.println(min+"minutes");
              }
           }
           if(min==60)
           {
              hr++;
              System.out.println(hr+"hours");
           }
         }
         if(hr==24)
         {
            d++;
            System.out.println(d+"days");
         }
       }
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
   }
 }
class lab22
{
  public static void main(String args[])
  {
    mythread th=new mythread();
    Thread t=new Thread(th);
    t.start();
  }
}