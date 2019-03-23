package logical;

public class FiboNacci {

	public static void main(String[] args) {
		
		int sum =0 , n1=0 , n2=1;
		
		for(int i=0; i<=10; i++) {
			
			System.out.print(sum + ",");
			
			sum = n1+n2;
			n2=n1;
			n1=sum;
			 // n1=n2;
			//  n2=sum;
			   
			
			
			
			
			
		}
		
		

	}
	
	

}
