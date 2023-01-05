import java.util.Scanner;

public class powerAndFactorial {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int n = input.nextInt();
		System.out.println((float)power(x,n)/factorial(n));
		
	}
	
	public static int power(int x, int n){
		int result=1;
		for(int i =0;i<n;i++){
			result = result * x;
		}
		
		return result ;
	}
	
	public static int factorial(int n){
		int result=1;
		for(int i=1;i<=n;i++){
			result = result * i;
		}
		
		return result ;
	}

}
