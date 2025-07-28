package randomEx;
import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
		// 
		int balance=100000;
		int withdrawal;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("현재 잔액 :"+ balance);
	
		
		while(true) {
			
			System.out.println("인출액 입력 :");
			withdrawal=sc.nextInt();
			if(balance < withdrawal) {
				System.out.println("잔액이 부족합니다. 현재 잔액:"+ balance);
				break;
			}
			balance -= withdrawal;
			System.out.println(balance);
			
		}
		sc.close();

	}

}
