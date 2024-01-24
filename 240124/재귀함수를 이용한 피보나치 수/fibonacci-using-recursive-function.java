import java.util.Scanner;

public class Main {
    public static int printFiboNum(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else if(n == 0){
            return 0;
        }
        else{
            return printFiboNum(n - 1) + printFiboNum(n - 2);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        System.out.printf("%d", printFiboNum(n));
    }
}