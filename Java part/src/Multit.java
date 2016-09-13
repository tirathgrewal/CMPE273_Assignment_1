import java.util.*;
class Multit implements Runnable {
   private Thread t;
   private int number;
   private String name;
  
   
   public Multit(String name,int number){
       this.name=name;
       this.number=number;
       System.out.println(name+" has decimal number: "+number);
   }
   public String cal(int number){
	   System.out.println("Running "+name);
	      int dig;
	      String s=""; 
	      char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	      
	      while(number>0)
	      {
	       dig=number%16; 
	       s=hex[dig]+s; 
	       number=number/16;
	      }
	     System.out.println("Decimal to hexadecimal: "+s);
	     return s;
	    
   }
   public void run() {
	   try{
		   String s1=cal(number);
		   Thread.sleep(500);
	   }
	   catch(InterruptedException e)
	   {
		   System.out.println("Exception caught:"+e);
	   }
   
   
   System.out.println(name+" exiting");
   }
   
   public void start ()
   {
      System.out.println(name+" is starting");
      if(t==null)
      {
         t=new Thread(this,name);
         t.start();
      }
   }

public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the first decimal number:");
	   int num1=sc.nextInt();
	   System.out.println("Enter the second decimal number:");
	   int num2=sc.nextInt();
      Multit m1=new Multit("Thread 1",num1);
      m1.start();
      Multit m2=new Multit("Thread 2",num2);
      m2.start();
   }   
}