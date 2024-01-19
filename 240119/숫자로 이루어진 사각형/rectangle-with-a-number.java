import java.util.Scanner;

public class Main {
    public static void printNNum(int n){
        int num = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", num);

                num = num == 9 ? 1 : num + 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        printNNum(userIn.nextInt());
    }
}