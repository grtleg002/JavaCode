package package1;

public class Example1 {

	public static void main(String[] args) {
		// 자바 변수 : type을 표현해야 함
		int value1; // 변수 선언
		int value = 10; //선언과 동시에 초기화
		value1 = 10;
		int result = value1 +10;
		
		System.out.println(result);
		
		//자바 상수 : 실행 중 값 기억 임시 기억장소(변수와 같음) 대입 후 실행 중 값이 변하지 않는다
		//final 데이터타입 상수명
		//변수와 구분하기 위해 대문자로 사용
		final int PRICE = 1000;
		//PRICE = 200; 변경 불가능
		
		//리터럴 : 변수에 저장되는 값
		// 정수, 실수, 문자, 문자열, 논리 리터럴
		value = 50; //50은 정수형 리터럴 이라고 함
		float valf =50.2f; // 실수 리터럴
		char valch = 'a'; //문자 리터럴
		String str = "abc";// 문자열 리터럴
		boolean a = true;//논리 리터럴
		
		//데이터 타입
		//기본타입 : 정수형-byte/short/int(기본)/long  실수형-float/double(기본) boolean char
		//참조형 : 기본 타입 제외 나머지 모두 String
		
		int aint =10; // 0, 4byte
		double bdouble =5.2; //기본값: 0.0d, 8byte
		char chr = 'A'; //기본값 '\u0000' ,2byte
		boolean bool = false; //기본값: false 1byte
		
		long lint =100; // 8byte , int 크기를 넘지않는 데이터를 저장
		long lint2 = 1000100010001000L; // int 크기를 넘어가는 데이터를 저장하려면 L을 붙여야한다
		float flt =5.0f ; //4byte
		short sint = 10; //2byte
		byte bint =1; // 1byte , 첫번째 비트를 부호로 사용 부호비트(-) 0000001 부호 -0 +1
		
		// 데이터 타입에 따라 사용 메모리 크기가 다름
		// 메모리 최소단위 : bit -> 0 또는 1  => 8개가 모이면 1byte 가 되고, 데이터를 구성하는 최소단위
		// bit : 2^1 표현 byte : 2 ^ 8 = 256 (0~255) 00000000 => 0, 11111111 => 255
		// byte: -2^7 ~2^7 -1표현 가능(0 포함해야해서 -1) : -128~ +127
		// int: -2,147,483,648 ~ +2,147,483,647
		
		// 실수 저장 - 저장방식이 정수형과 다르기 때문에 정수 타입보다 훨씬 큰 범위의 값 저장 가능
		// 부동 소수점 방식으로 저장
		// 부호비트 + 지수부 + 가수부
		// 4byte 부호비트(1비트) 지수부(8비트) 가수부(23비트)
		// 8byte 부호비트(1비트) 지수부(11비트) 가수부(52비트)
		// 십진수 12.375를 부동소수점 방식으로 표현하면 1.2375(가수부) * 10^1 (지수부)
		// 십진수 314.1592 를 부동소수점 방식으로 표현하면 3.141592 * 10^2
		// 십진수 0.0165 를 부동소수점 방식으로 표현하면  1.65* 10^-2
		
 		float avg = 88.5f; //float은 f나 F를 뒤에 붙여야 한다.
		double avg1 = 88.5;
		//e 사용해서 실수 표현
		double var3 =3e6; // 3뒤로 0을 6개 추가한다는 뜻 > 3000000
		float var4 =2e-3f; //소수점 이하 3자리
		System.out.println(var3);
		System.out.println(var4);
		
		System.out.println(true);
		
		// String 타입(문자열) - 레퍼런스 타입
		String name ="홍길동";
		char firstName= '홍';
		System.out.println(name);
		System.out.println(firstName);
		
		
	}

}
