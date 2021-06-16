package sample;

import java.util.Scanner;

public class Convert_char_to_int {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       char z;
       int i;
       System.out.println("Enter any character ");
       Scanner x=new Scanner(System.in);
       z=x.next().charAt(0);
       i=(int)z;
       System.out.println(i);
	}

}
