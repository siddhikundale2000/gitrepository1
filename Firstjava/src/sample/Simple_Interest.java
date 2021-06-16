package sample;

import java.util.Scanner;

public class Simple_Interest {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int P;
        float SI,R,T;
      Scanner e=new Scanner(System.in);
          
    System.out.println("Principal is ");
    P=e.nextInt();
	System.out.println("Rate per annum  is ");
	R=e.nextFloat();
	System.out.println("Time in year is ");
	T=e.nextFloat();
	SI=P*R*T/100;
	System.out.println("Simple Intrest is " +SI);
	}
}
