package arrayType;

import java.util.Arrays;

public class ArrayCopyofRange {

	public static void main(String[] args) {
		// Arrays.copyofRange(원본배열, 시작 인덱스, 끝 인덱스+1) : 원본배열에서 시작인덱스 ~끝 인덱스까지 원소 복사 후 새로운 배열 생성
		int a[]= {1,2,3,4};
		int[] b =Arrays.copyOfRange(a, 1, 3);
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
			
		}
		System.out.println();
		for(int i = 0; i<a.length; i++) {
			System.out.print(b[i]+ " ");
			
		}
		
		b[0] =10;
		System.out.println();
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+ " "); 
			
		}
		System.out.println();
		for(int i = 0; i<a.length; i++) {
			System.out.print(b[i]+ " ");// b배열과 a 배열은 서로 다른 객체
			
		}

	}

}
