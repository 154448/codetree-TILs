import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String[] strs = new String[10];


        for(int i = 0; i < 10; i++){
            strs[i] = userIn.next();
        }

        int tot = 0;

        for(int i = 0; i < 10; i++){
            tot += strs[i].length();
        }

        System.out.printf("%d", tot);
    }
}