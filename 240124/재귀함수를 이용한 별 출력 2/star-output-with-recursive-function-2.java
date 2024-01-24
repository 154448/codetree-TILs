import java.util.Scanner;

public class Main {
    public static void printStar(int n){
        String str = "";

        for(int i = 0; i < n; i++){
            str += "* ";
        }

        System.out.printf("%s\n", str);

        if(n > 1){
            printStar(n - 1);
        }

        System.out.printf("%s\n", str);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        printStar(n);
    }
}