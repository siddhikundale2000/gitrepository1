package sample;

import java.util.Scanner;

public class Sum_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c;
      int sum;
      float avg;
      System.out.println("Enter any three numbers");
      Scanner s1=new Scanner(System.in);
      a=s1.nextInt();
      b=s1.nextInt();
      c=s1.nextInt();
      sum=a+b+c;
      avg=(float)sum/3;
      System.out.println("sum of three number is "+sum);
      System.out.println("average of three number is "+avg);
	}

}
