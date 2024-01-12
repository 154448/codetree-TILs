import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[][] first = new int[n][m];
        int[][] second = new int[n][m];

        for(int c = 0; c < 2; c++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(c == 0){
                        first[i][j] = userIn.nextInt();
                    }
                    else{
                        second[i][j] = userIn.nextInt();
                    }
                }
            }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%d ", first[i][j] == second[i][j]? 0 : 1);
            }
            System.out.printf("\n");
        }

    }
}