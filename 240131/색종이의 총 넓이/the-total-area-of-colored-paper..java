import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[][] plane = new int[201][201];

        int tot = 0;

        int n = userIn.nextInt();

        for(int i = 0; i < n; i++){
            int xs = userIn.nextInt() + 100;
            int ys = userIn.nextInt() + 100;

            for(int x = 0; x < 8; x++){
                for(int y = 0; y < 8; y++){
                    if(plane[xs + x][ys + y] == 0){
                        tot += 1;
                        plane[xs + x][ys + y] = 1;
                    }
                }
            }
        }

        System.out.printf("%d", tot);
    }
}