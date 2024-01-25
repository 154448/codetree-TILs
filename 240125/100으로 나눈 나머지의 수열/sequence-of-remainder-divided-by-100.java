import java.util.Scanner;

public class Main {
    public static int computeArr(int n){
        if(n == 1){
            return 2;
        }
        else if(n == 2){
            return 4;
        }
        else{
            return computeArr(n - 1) * computeArr(n - 2) % 100;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        System.out.printf("%d", computeArr(n));
    }
}