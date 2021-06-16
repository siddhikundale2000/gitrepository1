package sample;

import java.util.Scanner;

public class ASCIIvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		int x;
		System.out.println("Enter any character");
		Scanner p=new Scanner (System.in);
		ch=p.next().charAt(0);
		x=(int)ch;
		System.out.println(x);
	}

}
