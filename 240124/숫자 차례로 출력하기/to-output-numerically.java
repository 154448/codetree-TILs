import java.util.Scanner;

public class Main {
    public static void printNums(int n){
        if(n == 1){
            System.out.printf("%d ", n);
            return;
        }
        else{
            printNums(n - 1);
            System.out.printf("%d ", n);
        }
    }
    public static void printReverseNums(int n){
        if(n == 1){
            System.out.printf("%d ", n);
            return;
        }
        else{
            System.out.printf("%d ", n);
            printReverseNums(n - 1);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        printNums(n);
        System.out.println();
        printReverseNums(n);
    }
}