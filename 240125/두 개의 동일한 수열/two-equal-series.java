import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] first = new int[n];
        int[] second = new int[n];

        for(int i = 0; i < n; i++){
            first[i] = userIn.nextInt();
        }

        for(int i = 0; i < n; i++){
            second[i] = userIn.nextInt();
        }

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.printf("%s", Arrays.equals(first, second)? "Yes": "No");
    }
}