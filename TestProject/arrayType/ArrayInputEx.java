package arrayType;
import java.util.Scanner;

import java.util.Arrays;
public class ArrayInputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num =  new String[5];
		
		System.out.println("숫자 입력 ");
		for(int i=0;i<num.length; i++) {
			System.out.printf("num[%d]:" ,i);
			num[i]= sc.next();
		}
			
			
			System.out.println("입력된 값:"+ Arrays.toString(num));
			
			 int[] numbers = new int[num.length];
		        for (int i = 0; i < num.length; i++) {
		            numbers[i] = Integer.parseInt(num[i]); 
		        }

		        
		        int max = numbers[0];
		        for (int i = 1; i < numbers.length; i++) {
		            if (numbers[i] > max) {
		                max = numbers[i];
		            }
		        }

		     
		        System.out.println("최대값: " + max);
			
		}
 
	

}
