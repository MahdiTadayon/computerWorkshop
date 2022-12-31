import java.util.Scanner;

public class kargah_computer_18 {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int count_even = 0;
		int count_odd = 0; 
		for(int i=0;i<n;i++){
			int number = input.nextInt();
			if(number%2==0){
				count_even +=1;
			}
			else{
				count_odd +=1;
			}
		}
		
		
		System.out.println("even:" + count_even);
		System.out.println("odd:" + count_odd);
		
	}

}
