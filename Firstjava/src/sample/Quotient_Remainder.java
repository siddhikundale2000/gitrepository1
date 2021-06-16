package sample;

import java.util.Scanner;
public class Quotient_Remainder {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int n,x;
        int quotient,remainder;
        System.out.println("Enter dividend number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.println("Enter divisior number ");
        Scanner s=new Scanner(System.in);
        x=s.nextInt(); 
        quotient=n/x;
        remainder=n%x;
        System.out.println("Quotient is "+quotient);
        System.out.println("Remainder is "+remainder);
	}

}
