import java.lang.Math; 

public class randomNumber {
	public static void main(String[] args ){
		for(int i=1;i<6;i++){
			int random_number =(int)(Math.random() * (100-1)) + 1;
			System.out.println("number #"+i+" : "+random_number);
		}
		
		
	}
}
