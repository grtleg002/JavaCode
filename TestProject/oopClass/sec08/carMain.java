package oopClass.sec08;

public class carMain {

	public static void main(String[] args) {
		// 사용자 정의 클래스 Car를 사용.
		// 1. Car클래스 객체 생성 2. 생성된 객체 통해서 멤버 변수나 멤버 메소드 사용(사용은  접근 제한에 따라 다름)
		// Car클래스는 현재 클래스(CarMain)와 동일 패키지 내에 있음 - import 없이 사용 가능
		Car c = new Car("11가1111","k7","기아");//객체 생성 - 명시적 생성자 호출
		// c 인스턴스 생성
		
		//객체 통해서 멤버변수 또는 멤버 메소드 사용
		//carNo는 private : 클래스 외부에서 직접 접근 불가능
		//c.carNo ="123더1234";
		//System.out.println(c.carNo);
		
		// public 메소드이기에 호출 가능
		c.setCarInfo("11가 1111","k7","기아",2025,1500); //c 참조변수가 참고하고 있는 객체의 멤버변수에 값이 저장됨
		c.showCarInfo(); //c 참조변수가 참조하는 객체의 멤버변수 값을 출력
		
		//Car 클래스 인스턴스 b 생성
		Car b = new Car();
		b.setCarInfo("22나 2222","그랜져","현대",2023,2000); 
		b.showCarInfo();
		

	}

}
