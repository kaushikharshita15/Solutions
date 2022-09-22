package solutions;

import java.util.Scanner;

public class CompatibleArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size for First Array:");
    int n = sc.nextInt();
   if(n>0) {
    int[] arr1 = new int[n];
    System.out.println("Enter the elements for first array:");
    for(int i = 0; i<arr1.length;i++ )
    {
    	arr1[i]= sc.nextInt();
    }
    
    System.out.println("Enter the size for Second Array:");
    int l = sc.nextInt();
    int[] arr2 = new int[l];
    System.out.println("Enter the elements for Second array:");
    for(int j = 0; j<arr2.length;j++ )
    {
    	arr2[j]= sc.nextInt();
    }
    
    if(n==l) {
    	boolean s= false;
    for(int i = 0 ;i<arr1.length;i++)
    {
    	if(arr1[i]>=arr2[i])
    	{
    		 s = true;
    	}
    	
    }
    if(s==true) {
		System.out.println("Arrays are Compatible");
	}
   

    }
    else
    {
    	System.out.println("Arrays are Not Compatible");
    }
   }
   else 
   {
	System.out.println("Invalid array size");   
   }

  }
}
