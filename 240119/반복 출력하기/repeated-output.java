import java.util.Scanner;

public class Main {
    public static void printNStar(int n){
        for(int i = 0; i < n; i++){
            System.out.printf("%s\n", "12345^&*()_");
        }
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        printNStar(userIn.nextInt());
    }
}