package solutions;

import java.util.Scanner;

public class Bill_genrator {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the no of pizzas bought:");
		int p = sc.nextInt();
		System.out.print("Enter the no of puffs bought:");
		int pu = sc.nextInt();
		System.out.print("Enter the no of cool drinks bought:");
		int c = sc.nextInt();
		
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+p);
		System.out.println("No of puffs:"+pu);
		System.out.println("No of cooldrinks:"+c);
		System.out.println("Total price="+((p*100)+(20*pu)+(10*c)));
		System.out.println("ENJOY THE SHOW!!!");
		
	}

}
