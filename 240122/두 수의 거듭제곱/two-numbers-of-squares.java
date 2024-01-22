import java.util.Scanner;

public class Main {
    public static int userPow(int a, int b){
        int res = a;

        for(int i = 1; i < b; i++){
            res *= a;
        }

        return res;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        System.out.printf("%d", userPow(userIn.nextInt(), userIn.nextInt()));
    }
}