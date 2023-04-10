import java.io.*;
import java.util.Scanner;
public class sample
	{
		public static void main(String[] args)
			{
				Scanner s1=new Scanner(System.in);
				System.out.println("enter the  first number");
				int a=s1.nextInt();
				Scanner s2=new Scanner(System.in);
				System.out.println("enter the second number");
				int b=s2.nextInt();
				
				int c=a+b;
				System.out.println("the sum is:"+c);
				
			}

	 }