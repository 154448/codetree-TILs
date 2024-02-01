import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);
        
        //N, E, S, W
        int d = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0;
        int y = 0;
        int t = 0;

        int res = -1;

        String order = userIn.nextLine();

        for(int i = 0; i < order.length(); i++){
            char direction = order.charAt(i);

            if(direction == 'L' || direction == 'R'){
                d = direction == 'L' ? (d - 1): (d + 1);
                d %= 4;
                d = d < 0 ? d + 4 : d; 
            }
            else{
                x += dx[d];
                y += dy[d];
            }
            t += 1;

            if(x == 0 && y == 0){
                res = t;
                break;
            }
        }
        System.out.printf("%d", res);
    }
}