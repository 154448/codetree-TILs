import java.util.Scanner;

public class Main {
    public static int getDirection(char d){
        int res = -1;
        if(d == 'U'){
            res = 0;
        }
        else if(d == 'D'){
            res = 2;
        }
        else if(d == 'R'){
            res = 1;
        }
        else if(d == 'L'){
            res = 3;
        }

        return res;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int n = userIn.nextInt();
        int t = userIn.nextInt();

        int x = userIn.nextInt() - 1;
        int y = userIn.nextInt() - 1;

        char d = userIn.next().charAt(0);

        int direction = getDirection(d);

        for(int i = 0; i < t; i++){
            x += dx[direction];
            y += dy[direction];

            if(x >= n || y >= n || x < 0 || y <0){
                x -= dx[direction];
                y -= dy[direction];

                direction = (direction + 2) % 4;
            }
        }

        System.out.printf("%d %d", y, x);


    }
}