import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();

        int tot = 0;

        for(int i = 0; i < str.length(); i++){
            int n = (int)str.charAt(i);

            if(n >= 48 && n <= 57){
                tot += (n - 48);
            }
        }

        System.out.printf("%d", tot);
    }
}