import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        int[] locationA = new int[1001];
        int[] locationB = new int[1001];

        int timeA = 0;
        int timeB = 0;

        for(int c = 0; c < n; c++){
            char d = userIn.next().charAt(0);
            int direction = d == 'R' ? 1 : -1;

            int distance = userIn.nextInt();

            for(int i = 0; i < distance; i++){
                locationA[timeA + 1] = locationA[timeA] + direction;
                timeA += 1;
            }
        }

        for(int c = 0; c < m; c++){
            char d = userIn.next().charAt(0);
            int direction = d == 'R' ? 1 : -1;

            int distance = userIn.nextInt();

            for(int i = 0; i < distance; i++){
                locationB[timeB + 1] = locationB[timeB] + direction; 
                timeB += 1;
            }
        }

        int res = -1;

        for(int i = 1; i <= (timeA > timeB ? timeB : timeA); i++){
            if(locationA[i] == locationB[i]){
                res = i;
                break;
            }
        }

        System.out.printf("%d", res);
    }
}