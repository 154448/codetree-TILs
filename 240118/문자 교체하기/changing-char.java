import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str1 = userIn.next();
        String str2 = userIn.next();


        System.out.printf("%s", str1.substring(0,2) + str2.substring(2));
    }
}