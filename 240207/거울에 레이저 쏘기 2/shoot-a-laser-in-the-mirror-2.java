import java.util.Scanner;

public class Main {
    public static int getDirection(char shape, int d){
        int res = -1;

        if(shape == '\\'){
            res = (d % 2 == 0) ? (d + 2) % 4 + 1 : (d + 2) % 4  - 1;
        }
        else{
            res = (d % 2 == 0) ? (d + 2) % 4 - 1 : (d + 2) % 4 + 1;
        }

        return res < 0 ? res + 4 : res;
    }

    public static int getStartPointR(int point, int d, int n){
        if(d == 0){
            return -1;
        }
        else if(d == 1){
            return point % n;
        }
        else if(d == 2){
            return n;
        }
        else{
            return (n - 1) - (point % n);
        }
    }

    public static int getStartPointC(int point, int d, int n){
        if(d == 0){
            return point;
        }
        else if(d == 1){
            return n;
        }
        else if(d == 2){
            return (n - 1) - (point % n);
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        //남, 서, 북, 동
        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, -1, 0, 1};

        int n = userIn.nextInt();
        userIn.nextLine();

        char[][] plane = new char[n][n];

        for(int i = 0; i < n; i++){
            String tmp = userIn.nextLine();
            for(int j = 0; j < n; j++){
                plane[i][j] = tmp.charAt(j);
            }
        }

        int startPoint = userIn.nextInt() - 1;
        int direction = startPoint / n;
        int r = getStartPointR(startPoint, direction, n);
        int c = getStartPointC(startPoint, direction, n);

        int cnt = -1;

        do{
            try{
                r += dr[direction];
                c += dc[direction];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.printf("%d", direction);
            }
            
            cnt += 1;
            
            if(r >= 0 && r < n && c >= 0 && c < n){
                direction = getDirection(plane[r][c], direction); 
            }
            else{
                break;
            }
        }while(r >= 0 && r < n && c >= 0 && c < n);

        System.out.printf("%d", cnt == -1 ? 0 : cnt);
    }
}