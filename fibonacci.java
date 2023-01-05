import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("---------------");
		
		for(int i=1;i<=n;i++){
			System.out.println(fibo(i));
		}
	}
	
	public static int fibo(int n){
		if (n==1){
			return 1;
		}
		else if (n==2){
			return 1;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}
}
