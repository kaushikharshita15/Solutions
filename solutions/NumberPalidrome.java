package solutions;

import java.util.Scanner;

public class NumberPalidrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int l=0;
	int j =n;
	while(j>0) 
	{
		int k = j%10;
		l = l*10+k;
		j /=10;
		
	}
	if(n==l) 
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
	
 }

}
