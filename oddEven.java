import java.util.Scanner;

public class kargah_computer_1 {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
		
	}

}
