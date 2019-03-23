package logical;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please provide the number:");
		
		int inputnum = sc.nextInt();
		
		sc.close();
		
		int sum =0;
		
		int num =inputnum;
		
		while (num != 0)
			
		{
			System.out.println(num);
			int digit= num % 10;
			double digit_cube = Math.pow(digit, 3);
			sum = (int) (sum + digit_cube);
			num = num/10;
			
					
		}
		
		//System.out.println(sum);
		
		if (sum==inputnum) {
			
			System.out.println("Provided number is an armstrong no");
		}

	}

}
