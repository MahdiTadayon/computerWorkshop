import java.util.Scanner;

public class kargah_computer_7 {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		int sum=0;
		for(int i=0;i<n;i++){
			int number =input.nextInt();
			sum += number ;
		}
		
		System.out.println("sum : " + sum);
	}
}
