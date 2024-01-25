import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String first = userIn.next();
        String second = userIn.next();

        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        System.out.printf("%s", Arrays.equals(firstArr, secondArr)?"Yes" : "No");
    }
}