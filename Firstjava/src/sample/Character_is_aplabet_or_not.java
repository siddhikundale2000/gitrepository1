package sample;

import java.util.Scanner;

public class Character_is_aplabet_or_not {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter any alphabet ");
		Scanner z=new Scanner(System.in);
		ch=z.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
		{
		System.out.println( ch+ " is alphabet");
	    }
		else 
		{
			System.out.println(ch+ " is not alphabet");
		}
	}
}
