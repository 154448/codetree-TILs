import java.util.Scanner;

public class Main {
    public static int findNum(int n){
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else{
            return findNum(n / 3) + findNum(n - 1);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        System.out.printf("%d", findNum(n));
    }
}