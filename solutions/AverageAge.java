package solutions;

import java.util.Scanner;

public class AverageAge {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no.of employees:");
		int j = sc.nextInt();
		int [] arr = new int [j];
		System.out.println("Enter the age for "+j+" employees:");
		for(int i = 0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		double avg = calculateAverage(arr);
		System.out.println("The average age is "+avg);
	}
	public  static double calculateAverage(int[] age) {
		
		
		double sum = 0;
		double avg = 0;
		for(int i = 0; i<age.length;i++) {
			sum += age[i];
		}

        avg = sum/age.length;
        return avg;
	} 

}
