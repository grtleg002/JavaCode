package arrayType;
import java.util.Random;

public class ArrayExer3 {
    public static void main(String[] args) {
        int[] lotto = new int[6];  
        Random rand = new Random();

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = rand.nextInt(45) + 1; 

            
           
            for (int j = 0; j < i; j++) {
                if (lotto[j] == lotto[i]) {
                  i--;
                  break;}
            }
        }

        // 결과 출력
        System.out.print("로또 번호: ");
        for (int n : lotto) {
            System.out.print(n + " ");
        }
    }
}
