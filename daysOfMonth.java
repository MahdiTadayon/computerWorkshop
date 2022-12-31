import java.util.Scanner;

public class kargah_computer_6 {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();;
		if(month>=1 && month <=6){
			System.out.println("day=31");
		}
		else if(month>=7 && month <=11){
			System.out.println("day=30");
		}
		else if (month ==12){
			System.out.println("day=29");	
		}
		else{
			System.out.println("error");
		}
		
		
	}

}
