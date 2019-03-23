package logical;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number:");
		
		int inputNum = sc.nextInt();
		sc.close();
		
		
		checkPerfectNum(inputNum);
		
		
	}

	
	public static void checkPerfectNum(int num) {
		
		
		int sum =0;
		
		for (int i =1; i<= num/2; i++)  {
		
		if (num%i ==0) {
			
			sum = sum +i;
			
			
		}
		}
		
		if (sum==num) {
			
			System.out.println(num +" is a perfect no");
		}
		
		else {
			
			System.out.println(num +" is not a perfect no");
		}
		
		
	}
	
}
