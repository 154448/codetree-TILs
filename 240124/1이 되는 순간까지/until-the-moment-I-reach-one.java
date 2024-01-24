import java.util.Scanner;

public class Main {
    public static int countToOne(int n){
        if(n == 1){
            return 0;
        }
        else if(n % 2 == 0){
            return 1 + countToOne(n / 2);
        }
        else{
            return 1 + countToOne(n / 3);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        System.out.printf("%d", countToOne(n));
    }
}