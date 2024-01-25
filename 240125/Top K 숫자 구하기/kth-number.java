import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);
        
        int n = userIn.nextInt();
        int k = userIn.nextInt();

        int[] words = new int[n];

        for(int i = 0; i < n; i++){
            words[i] = userIn.nextInt();
        }

        Arrays.sort(words);

        System.out.printf("%s", words[k - 1]);
    }
}