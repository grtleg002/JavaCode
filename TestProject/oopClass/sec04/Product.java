package oopClass.sec04;
import java.util.Scanner;

public class Product {
	private String prdName; // 상품명
	private int prdPrice; // 가격
	private int prdSold; //판매 수량
	private int prdStock; //재고 수량

	public void inputPrdInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("****상품 정보 입력****");
		System.out.printf("상품명 :");
		prdName=sc.next(); 
		System.out.printf("가격 :");
		prdPrice=sc.nextInt();
		System.out.printf("판매 수량 :");
		prdSold=sc.nextInt();
		System.out.printf("재고 수량 :");
		prdStock=sc.nextInt();
	}
	
	public void showPrdInfo() {
		System.out.println("****상품 정보 출력****");
		System.out.println("상품명 :" +prdName);
		
		System.out.println("가격 :"+prdPrice);
		
		System.out.println("판매 수량 :"+prdSold);
		
		System.out.println("재고 수량 :"+prdStock);
		
	}
	
	public void showSalesAmount() {
		System.out.println("매출액 :"+ prdPrice * prdSold);
	}
	public void showStockAmount() {
		System.out.println("재고액 :"+prdPrice * prdStock);
	}
}
