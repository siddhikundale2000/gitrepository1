package sample;

import java.util.Scanner;
public class Largest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x,y,z;
       System.out.println("Enter any three numbers ");
       Scanner a1=new Scanner(System.in);
       x=a1.nextInt();
       y=a1.nextInt();
       z=a1.nextInt();
       if (x>y)
       {
    	  if(x>z)
    	  {
    		  System.out.println(x+" is largest number");
    	  }
    	  else
    	  {
    		  System.out.println(z+" is largest number");
    	  }
       }
       else
       {
    	   if(y>z)
    	   {
    		 System.out.println(y+ " is largst number");   
    	   }
    	   else
    	   {
    		 System.out.println(z+" is largest number");  
    	   }
       }
	}

}
