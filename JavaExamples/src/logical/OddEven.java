package logical;

import java.util.Scanner;




public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the no:");
		
		int inputNum = sc.nextInt();
		
		sc.close();
		
		 checkNum(inputNum);
		
		
		
	}
	
	public static void checkNum ( int number) {
		
	if (number <=0)	{
		
		System.out.println("Please provide a non zero positive integer");
	}
	
	else {
	
	if (number%2 ==0){
		
		System.out.println(number + " is an even number");
	}
	
	else 
	
	{
		System.out.println(number + " is an odd number");
	
	} 
	}


}
  }
