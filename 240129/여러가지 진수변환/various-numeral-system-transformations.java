import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int b = userIn.nextInt();

        String res = "";


        while(n >= b){
            res = n % b + res;

            n = n / b;
        }

        System.out.printf("%s", n + res);
    }
}