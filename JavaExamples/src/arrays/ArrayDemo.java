package arrays;

public class ArrayDemo {
//comment
	public static void main(String[] args) {
		  
		int a[] = new int[5];		
		a[1]= 4;
		a[2] =5;
		a[3] = 7 ;
		a[4] = 4;
		a[0] = 2;
		int size = a.length;		
		int i=0;
		while (i< size) {			
			
			System.out.println(a[i]);
			i++;
		}

	}

}
