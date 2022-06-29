package coreJavaTraining;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int num=31;
		int count = 0;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("pls enter");
//		int num = sc.nextInt();
		
		if(num>1)
		{
		  for(int i=1;i<=num;i++) {
				
			if(num%i==0) 
				 count++;
			}
	
		if(count==2) {
			System.out.println("it is prime");
		 }
		else {
			System.out.println("it is not prime");
		 }	   
		}
	}
 
}
