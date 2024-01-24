import java.util.Scanner;

public class Main {
    public static void printStr(int n){
        if(n == 1){
            System.out.print("HelloWorld\n");
            return;
        }
        else{
            printStr(n - 1);
        }

        System.out.print("HelloWorld\n");
    }

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        printStr(n);

    }
}