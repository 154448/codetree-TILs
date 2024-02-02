import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int t = userIn.nextInt();

        int[][] nums = new int[n][n];

        userIn.nextLine();
        String command = userIn.nextLine();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = userIn.nextInt();
            }
        }

        //Up, Right, Down, Left
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        int r = n / 2;
        int c = n / 2;
        int d = 0;

        int tot = nums[r][c];

        for(int i = 0; i < t; i++){
            char o = command.charAt(i);

            if(o == 'F'){
                r += dr[d];
                c += dc[d];

                if(r < 0 || c < 0 || r >= n || c >= n){
                    r -= dr[d];
                    c -= dc[d];   
                }
                else{
                    tot += nums[r][c];
                }

            }
            else{
                d += (o == 'L' ? -1 : 1);


                d = d < 0 ? d + 4 : d;
            }
        }

        System.out.printf("%d", tot);
    }
}