package arrayType;
import java.util.Scanner;
public class Array2DEx {

	public static void main(String[] args) {
		String[][] word = {{"chair","의자"},{"computer","컴퓨터"},{"integer","정수"}};
		Scanner sc = new Scanner(System.in);
		String answer;
		for (int i=0; i<word.length; i++) {
			 
			System.out.printf("Q%d. %s의 뜻은? : ", i + 1, word[i][0]);

			answer=sc.next();
			if(answer.equals(word[i][1])) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다. 정답은 "+word[i][1]+"입니다.");
			}
		}
				

	}

}
