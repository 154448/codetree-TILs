import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int tot = 0;

        int[] an = new int[n];

        for(int i = 0; i < n; i++){
            int tmp = userIn.nextInt();
            an[i] = tmp;
            tot += tmp;
        }

        int minDist = 1000000;

        for(int i = 0; i < n; i++){
            int moveDist = 0;
            int people = tot;
            
            for(int j = 0; j < n; j++){
                people -= an[(i + j) % n];
                moveDist += people;
            }

            minDist = Math.min(minDist, moveDist);
        }

        System.out.printf("%d", minDist);
    }
}