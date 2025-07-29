package oopClass.sec10;

public class Reservation {
 // 멤버 변수 선언
 String flightNo;
 String name;
 String departure;
 String destination;
 int price;
 String seatNo;

 
 public Reservation(String flightNo, String name, String departure,
                    String destination, int price, String seatNo) {
     this.flightNo = flightNo;
     this.name = name;
     this.departure = departure;
     this.destination = destination;
     this.price = price;
     this.seatNo = seatNo;
 }

 // 생성자2: 기본 예약 정보로 초기화 (오버로딩)
 public Reservation() {
     this("KE1001", "홍길동", "인천", "뉴욕", 1600000, "A38");
 }

 // 예약 정보 출력 메서드
 public void showRsvInfo() {
     System.out.println("**항공권 예약 정보**");
     System.out.println("항공기 : " + flightNo);
     System.out.println("예약자 : " + name);
     System.out.println("출발지 : " + departure);
     System.out.println("도착지 : " + destination);
     System.out.println("금액 : " + price);
     System.out.println("좌석번호 : " + seatNo);
 }
}

