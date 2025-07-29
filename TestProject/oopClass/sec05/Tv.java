package oopClass.sec05;

public class Tv {
	String color; //접근 제한 생략: default(동일 패키지 내에서는 객체통한접근 가능)
	boolean power;
	int channel;
	
	//Tv 기능
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
