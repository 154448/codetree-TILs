import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] house = new int[n];

        for(int i = 0; i < n; i++){
            house[i] = userIn.nextInt();
        }

        int answer = 1000000;


        for(int i = 0; i < n; i++){
            int dist = 0;
            for(int j = 0; j < n; j++){
                if(j != i){
                    int diff = Math.abs(j - i);
                    dist += (diff * house[j]);
                }
            }
            answer = Math.min(answer, dist);
        }

        System.out.printf("%d", answer);
    }
}