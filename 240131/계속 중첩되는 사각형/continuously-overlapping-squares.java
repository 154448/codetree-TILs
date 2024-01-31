import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int tot = 0;
        int[][] plane = new int[201][201];
        int offset = 100;

        int n = userIn.nextInt();
        userIn.nextLine();
        userIn.nextLine();

        for(int i = 1; i < n; i++){
            int x1 = userIn.nextInt() + offset;
            int y1 = userIn.nextInt() + offset;
            int x2 = userIn.nextInt() + offset;
            int y2 = userIn.nextInt() + offset;

            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    if(i % 2 == 0 ){
                        if(plane[x][y] == 2){
                            tot -= 1;
                        }
                        plane[x][y] = 1;
                    }
                    else{
                        if(plane[x][y] != 2){
                            tot += 1;
                            plane[x][y] = 2;
                        }
                    }
                }
            }
        }

        System.out.printf("%d", tot);
    }
}