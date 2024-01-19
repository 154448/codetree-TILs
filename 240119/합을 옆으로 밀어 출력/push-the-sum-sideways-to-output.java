import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int tot = 0;

        for(int i = 0; i < n; i++){
            tot += userIn.nextInt();
        }

        String str = Integer.toString(tot);

        System.out.printf("%s", str.substring(1) + str.charAt(0));
    }
}