import java.util.Scanner;

public class kargah_computer_15 {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		int min = -1;
		if( z <= y && z <= x ){
			min = z;
		}
		else if ( y <= x && y <= z ){
			min = y;
		}
		else{
			min = x;
		}
		
		System.out.println(min);
		
		
		
	}


}
