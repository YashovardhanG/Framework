/**
 * 
 */
package FileHandling;

import java.io.File;
import java.io.IOException;

/**
 * @author Yash
 *
 */
public class CreateFIle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {			
			File file = new File("D://Learning Java//File2.txt");
			
			boolean fvar;
			fvar = file.createNewFile();
			String str = String.valueOf(fvar);
			System.out.println(str);
			int number = booleanToInt(fvar);
			System.out.println(number);
				
			if (fvar){
				System.out.println("File created successfully");
			}
			else{
				System.out.println("File alrady exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}	public static int booleanToInt(boolean value) {
        // Convert true to 1 and false to 0.
        return value ? 1 : 2;
    }

}
