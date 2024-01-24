import java.util.Scanner;

public class Main {
    public static void printNum(int n){
        System.out.printf("%d ", n);
        
        if(n > 1){
            printNum(n - 1);
        }

        System.out.printf("%d ", n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        printNum(n);
    }
}