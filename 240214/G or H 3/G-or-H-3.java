import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        char[] point = new char[10001];

        int n = userIn.nextInt();
        int k = userIn.nextInt() + 1;

        for(int i = 0; i < n; i++){
            int position = userIn.nextInt();
            char a = userIn.next().charAt(0);

            point[position] = a;
        }

        int maxScore = 0;


        for(int i = 1; i < 10001 - k; i++){

            int tot = 0;

            for(int j = 0; j < k; j++){
                int score = 0;

                if(point[i + j] == 'G'){
                    score = 1;
                }
                else if(point[i + j] == 'H'){
                    score = 2;
                }

                tot += score;
            }

            maxScore = Math.max(maxScore, tot);
        }

        System.out.printf("%d", maxScore);
    }
}