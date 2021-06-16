package sample;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    int x,y;
     System.out.print("Enter any two number ");
     Scanner s=new Scanner(System.in);
     x=s.nextInt();
     y=s.nextInt();
      
     x=x+y;
     y=x-y;
     x=x-y;
     
     System.out.println("value of first number after swapping "+x);
     System.out.println("vaue of second number after swapping " +y);
	}

}
