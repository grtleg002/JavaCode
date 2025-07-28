package package2;

public class Break2 {

	public static void main(String[] args) {
		// 중첩 반복일 떄 break 범위 -label 사용
		for(char upper='A'; upper<='Z'; upper++){
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break ; // break 문과 가장 가까운 for문을 벗어남
				}
			}
			
		}
		System.out.println("프로그램실행 종료");
		
		// 중첩 반복일 떄 break 범위 -label 사용
				Outter:for(char upper='A'; upper<='Z'; upper++){
					for(char lower='a'; lower<='z'; lower++) {
						System.out.println(upper + "-" + lower);
						if(lower=='g') {
							break Outter; // Outter 라는 라벨의 반복문 취소
						}
					}
					
				}
				System.out.println("프로그램실행 종료");
			
				Outter:for(char upper='A'; upper<='Z'; upper++){
					for(char lower='a'; lower<='z'; lower++) {
						System.out.println(upper + "-" + lower);
						if(lower=='g') {
							break ; // break 문과 가장 가까운 for문을 벗어남
						}
						
						if(upper == 'K') {
							break Outter;
						}
					}
					
				}
				System.out.println("프로그램실행 종료");
	}
	
	
}
