package sample;

import java.util.Scanner;

public class Circle {
            
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double area,circum;
		double pi=3.14;
         System.out.println("Enter radius of circle ");
         Scanner a=new Scanner(System.in);
        r=a.nextInt();
        
         area=pi*r*r;
         circum=2*pi*r;
         System.out.println("area of circle is "+area);
         System.out.println("Circumference of circle is "+circum);
	}

}
