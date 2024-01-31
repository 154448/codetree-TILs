import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int direction = 0;
        int[] current = {0, 0};

        String command = userIn.nextLine();

        for(int i = 0; i < command.length(); i++){
            char c = command.charAt(i);

            if(c == 'L'){
                direction += -1;
            }
            else if(c == 'R'){
                direction += 1;
            }
            else{
                int d = direction % 4;
                d = d < 0 ? d + 4: d;
                current[0] += dx[d];
                current[1] += dy[d];
            }
        }

        System.out.printf("%d %d", current[0], current[1]);
    }
}