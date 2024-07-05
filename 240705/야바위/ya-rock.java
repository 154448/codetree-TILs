import java.util.Scanner;

public class Main {

    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] stone = new int[3];

        int[][] command = new int[n][3];

        for(int i = 0; i < n; i++){
            command[i][0] = userIn.nextInt() - 1;
            command[i][1] = userIn.nextInt() - 1;
            command[i][2] = userIn.nextInt() - 1;
        }

        int maxScore = 0;

        for(int i = 0; i < 3; i++){
            int[] temp = stone.clone();

            temp[i] = 1;
            int score = 0;

            for(int j = 0; j < n; j++){
                swap(temp, command[j][0], command[j][1]);
                if(temp[command[j][2]] == 1){
                    score += 1;
                }
            }

            maxScore = Math.max(maxScore, score);
        }

        System.out.printf("%d", maxScore);
    }
}