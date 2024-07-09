import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int[][] nums = new int[3][3];

        int[][] res = new int[10][10];

        for(int i = 0; i < 3; i++){
            int now = userIn.nextInt();
            nums[i][0] = now / 100;
            nums[i][1] = (now % 100) / 10;
            nums[i][2] = now % 10;
        }
    
        //가로열 확인
        for(int i = 0; i < 3; i++){
            int[] point = new int[10];

            point[nums[i][0]] += 1;
            point[nums[i][1]] += 1;
            point[nums[i][2]] += 1;

            boolean isOne = false;
            int one = 0;
            boolean isTwo = false;
            int two = 0;

            for(int j = 1; j <= 9; j++){
                if(point[j] == 1){
                    isOne = true;
                    one = j;
                }
                if(point[j] == 2){
                    isTwo = true;
                    two = j;
                }
            }

            if(isOne && isTwo){
                res[one][two] += 1;
            }
        }
        //세로열 확인
        for(int i = 0; i < 3; i++){
            int[] point = new int[10];

            point[nums[0][i]] += 1;
            point[nums[1][i]] += 1;
            point[nums[2][i]] += 1;

            boolean isOne = false;
            int one = 0;
            boolean isTwo = false;
            int two = 0;

            for(int j = 1; j <= 9; j++){
                if(point[j] == 1){
                    isOne = true;
                    one = j;
                }
                if(point[j] == 2){
                    isTwo = true;
                    two = j;
                }
            }

            if(isOne && isTwo){
                res[one][two] += 1;
            }
        }

        for(int i = 0; i < 2; i++){
            int[] point = new int[10];

            point[nums[(i == 0)? 0 : 2][0]] += 1;
            point[nums[1][1]] += 1;
            point[nums[(i == 0)? 2 : 0][2]] += 1;

            boolean isOne = false;
            int one = 0;
            boolean isTwo = false;
            int two = 0;

            for(int j = 1; j <= 9; j++){
                if(point[j] == 1){
                    isOne = true;
                    one = j;
                }
                if(point[j] == 2){
                    isTwo = true;
                    two = j;
                }
            }

            if(isOne && isTwo){
                res[one][two] += 1;
            }
        }

        int cnt = 0;

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                cnt += (res[i][j] != 0) ? 1 : 0; 
            }
        }

        System.out.printf("%d", cnt);

        



    }
}