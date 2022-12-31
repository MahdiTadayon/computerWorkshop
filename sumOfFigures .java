import java.util.Scanner;

public class kargah_computer_2 {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int number[] = new int[n];
		int sum[] = new int[n];
		for(int i=0;i<n;i++){
			number[i] = input.nextInt();
			sum[i] = figures_sum(number[i]);
		}
		
		for(int i=0;i<n;i++){
			System.out.println(number[i]+"-->"+sum[i]);
			
		}
	}
	
	public static int figures_sum(int number){
		int sum = 0;
		while(number != 0){
			sum = sum + number % 10;
			number = (number - number % 10)/10;
		}
		return sum ;
	}

}


