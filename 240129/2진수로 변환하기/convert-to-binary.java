import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        String res = "";

        while(n >= 2){
            res = (n % 2) + res;

            n = n / 2;
        }

        System.out.printf("%s", n + res);
    }
}