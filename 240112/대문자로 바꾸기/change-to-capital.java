import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        char[][] string = new char[5][3];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                string[i][j] = userIn.next().charAt(0);
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                int temp = (int)string[i][j];
                System.out.printf("%c ", (char)temp - 32);
            }
            System.out.printf("\n");
        }
    }
}