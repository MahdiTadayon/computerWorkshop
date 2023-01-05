import java.util.Scanner;



public class kilometerToMeter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(true){
			int kilometer = input.nextInt();
			if(kilometer == 0){
			System.out.println("Error");
				break ;
			}
			System.out.println(kilometer+"Km" +"-->"+kilometer *1000+"m");
		}
	
	}

}

