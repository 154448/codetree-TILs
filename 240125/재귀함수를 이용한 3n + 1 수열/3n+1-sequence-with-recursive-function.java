import java.util.Scanner;

public class Main {
    public static int toOne(int n){
        int current = (n % 2 == 0)? n / 2 : 3 * n + 1;

        if(current == 1){
            return 1;
        }
        else{
            return 1 + toOne(current);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        System.out.printf("%d", toOne(n));
    }
}