import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int tot = 0;

        int offset = 1000;

        int[][] plane = new int[2001][2001];

        int[] firstCoordinate = new int[4];

        for(int i = 0; i < 2; i++){
            int x1 = userIn.nextInt() + offset;
            int y1 = userIn.nextInt() + offset;
            int x2 = userIn.nextInt() + offset;
            int y2 = userIn.nextInt() + offset;

            if(i == 0){
                firstCoordinate[0] = x1;
                firstCoordinate[1] = y1;
                firstCoordinate[2] = x2;
                firstCoordinate[3] = y2;
            }

            

            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    if(i == 0){
                        plane[x][y] = 1;
                    }
                    else{
                        if(plane[x][y] == 1){
                            plane[x][y] = 0;
                        }
                    }
                }
            }
        }

        int minX = 2001;
        int maxX = 0;
        int minY = 2001;
        int maxY = 0;

        for(int x = firstCoordinate[0]; x < firstCoordinate[2]; x++){
            for(int y = firstCoordinate[1]; y < firstCoordinate[3]; y++){
                if(plane[x][y] == 1){
                    minX = minX > x ? x : minX;
                    maxX = maxX < x ? x : maxX;
                    minY = minY > y ? y : minY;
                    maxY = maxY < y ? y : maxY;
                }
            }
        }

        //System.out.printf("%d %d %d %d \n", maxX, minX, maxY ,minY);


        System.out.printf("%d", (maxX - minX + 1) * (maxY - minY + 1));
    }
}