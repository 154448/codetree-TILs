import java.util.Scanner;

public class Main {
    public static int getDirection(char d){
        if(d == 'N'){
            return 0;
        }
        else if(d == 'W'){
            return 1;
        }
        else if(d == 'S'){
            return 2;
        }
        else{
            return 3;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] dx = {0,-1, 0, 1};
        int[] dy = {1, 0, -1, 0};

        int n = userIn.nextInt();

        int[] now = {0, 0};

        for(int i = 0; i < n; i++){
            char d = userIn.next().charAt(0);
            int dist = userIn.nextInt();

            now[0] = now[0] + dx[getDirection(d)] * dist;
            now[1] = now[1] + dy[getDirection(d)] * dist;
        }

        System.out.printf("%d %d", now[0], now[1]);
    }
}