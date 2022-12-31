import java.util.Scanner;


public class kargah_computer_4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int base10 = input.nextInt();
		String base2 ="";
		while(base10 !=1){    //Integer.toString(n);   //Integer.toBinaryString(n);
			 base2= base2 + Integer.toString(base10 % 2);
			 base10 = base10/2;
		}
		System.out.print("1");
		for (int i=base2.length()-1; i >=0 ; i--) {
            		System.out.print(base2.charAt(i));
        	}
        	System.out.print("\n");
        	
	}

}

