import java.util.Scanner;


public class maxAndmaxRepeat{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int max =0;
		int n = input.nextInt();
		int arr[] =new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
			if(arr[i] >=max){
				max = arr[i];
			}		
		}
		int count =0;
		for(int i=0;i<n;i++){
			if(arr[i] == max){
				count +=1;
			}
		}
		
		System.out.println("MAX : "+max+" ,repeat : " + count);
	}
}
