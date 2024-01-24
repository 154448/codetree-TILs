import java.util.Scanner;

public class Main {
    public static void printStar(int n){
        if(n == 1){
            System.out.printf("*\n");
            return;
        }
        else{
            String str = "";

            printStar(n - 1);
            for(int i = 0; i < n; i++){
                str += "*";
            }

            System.out.printf("%s\n", str);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        printStar(n);
    }
}