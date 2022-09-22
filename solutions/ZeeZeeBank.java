package solutions;

import java.util.Scanner;

public class ZeeZeeBank {
	public static void main(String[] args) {
		
		input();

	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number:");
		long AccNo =sc.nextLong();
		System.out.println(AccNo);
		System.out.println("Enter initial balance:");
		long i = sc.nextLong();
		System.out.println(i);
		System.out.println("Enter the amount to be deposited:");
		long d = sc.nextLong();
		System.out.println(d);
		
		long Bal = i+d;
		System.out.println("Available balance is:"+Bal);
		System.out.println("Enter the amount to be withdrawn:");
		long wid = sc.nextLong();
		if(Bal>=wid) 
		{
			System.out.println("Available balance is:"+ (Bal-wid));
		}
		else
		{
			System.out.println("Insufficient balance");
			System.out.println("Available balance is:"+Bal);
		}
	}
	

}
