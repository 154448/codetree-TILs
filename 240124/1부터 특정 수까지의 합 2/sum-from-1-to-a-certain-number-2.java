import java.util.Scanner;

public class Main {
    public static int sumFromOne(int n){
        if(n == 1){
            return n;
        }
        else{
            return (n + sumFromOne(n - 1));
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        System.out.printf("%d", sumFromOne(n));
    }
}