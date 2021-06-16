package sample;

import java.util.Scanner;

public class Vowel_consonanat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char ch;
       System.out.println("Enter any character ");
       Scanner p1=new Scanner(System.in);
       ch=p1.next().charAt(0);
        switch(ch)
        {
        case 'a':
        	System.out.println(ch+" is vowel");
        	break;
        case 'e':
        	System.out.println(ch+" is vowel");
        	break;
        case 'i':
                System.out.println(ch+" is vowelt");
    	        break;
        case 'o':
        	System.out.println(ch+" is vowel");
        	break;
        case 'u':
        	System.out.println(ch+ " is vowelt");
        	break;
        default :
        		System.out.println(ch+" is consonant");
    		   }
       
       
		
	}

}
