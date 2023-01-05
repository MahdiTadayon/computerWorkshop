import java.util.Scanner;


public class reverseNumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		while(number >1){
			System.out.print(number%10);
			number=number/10;
		}
		System.out.print("\n");
	}
}




