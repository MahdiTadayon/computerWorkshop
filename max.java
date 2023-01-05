import java.util.Scanner;

public class max {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int max=0;
		int n =input.nextInt();
		for(int i=0;i<n;i++){
			int number = input.nextInt();
			if(number >= max ){
				max = number ;
			}
		}
		
		System.out.println("max : " +max);
	}
}
