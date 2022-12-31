import java.util.Scanner;

public class kargah_computer_16 {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		int number=-1 ;
		int multiply = 1;
		for(int i =1 ; i<=n ;i++){
			number = input.nextInt();
			multiply = multiply * number ; 
		}
		System.out.println(multiply);
	}


}
