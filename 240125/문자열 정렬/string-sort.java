import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();

        char[] temp_str = str.toCharArray();

        Arrays.sort(temp_str);

        String result = new String(temp_str);

        System.out.printf("%s", result);
    }
}