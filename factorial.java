import java.util.Scanner;

public class kargah_computer_17 {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int factorial = 1 ;
		for(int i =1 ; i<=n ;i++){
			factorial *= i ;
		}		
		
		System.out.println(factorial);
				
	
	}


}
