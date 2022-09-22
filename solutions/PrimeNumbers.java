package solutions;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
       int l = sc.nextInt();
       int h = sc.nextInt();
       if(h>l) 
       {
       for(int j = l; j<=h;j++) {
   		int n = j;
   	     int i = 2;
   		int count = 0;
   		while(i<=n/2) {
   				if(n%i==0) {
   				count++;
   				
   				}
   				i++;
   			}
   		
   		
   		if(count==0) {
   			System.out.print(j+" ");
   			
   		}
   		}
       }
       else
       {
    	   System.out.println("Provide valid input");
       }
   		
  }
}