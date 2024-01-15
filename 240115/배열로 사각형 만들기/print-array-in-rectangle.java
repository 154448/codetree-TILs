public class Main {
    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        for(int j = 0; j < 2; j++){
            for(int i = 0; i < 5; i++){
                int r = 0;
                int c = 0;
                
                if(j == 0){
                    c = i;
                }
                else{
                    r = i;
                }

                nums[r][c] = 1;
            }
        }


        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 5; j++){
                nums[i][j] = nums[i - 1][j] + nums[i][j - 1];
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }


    }
}