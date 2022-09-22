package solutions;

import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the car no:");
		int n =sc.nextInt();
		int j =n;
		int c=0;
		int sum = 0;
		while(j>0) 
		{
			j =j/10;
			c++;
		}
		if(c==4) 
	    {
	
		while(n>0) 
		{
			int y = n%10;
			sum += y;
			n= n/10;
		}
	}
		if(sum%3==0 ||sum%5==0 ||sum%7==0)
		{
			System.out.println("Lucky Number");
		}
		else
		{
			System.out.println("Sorry its not my lucky number");
		}
	}

}
