import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[][] first = new int[3][3];
        int[][] second = new int[3][3];

        for(int c = 0; c < 2; c++){
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(c == 0){
                        first[i][j] = userIn.nextInt();
                    }
                    else{
                        second[i][j] = userIn.nextInt();
                    }
                }
            }
        }


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%d ", first[i][j] * second[i][j]);
            }
            System.out.printf("\n");
        }

    }
}