import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] current = new int[2000001];
        int[] cntW = new int[2000001];
        int[] cntB = new int[2000001];

        int idx = 100000;

        int n = userIn.nextInt();
        userIn.nextLine();


        for(int k = 0; k < n; k++){
            String[] input = userIn.nextLine().split(" ");

            int x = Integer.parseInt(input[0]);
            char d = input[1].charAt(0);

            int color = d == 'L' ? -1 : 1;

            if(d == 'L'){
                idx -= (x - 1);
            }

            for(int i = idx; i < idx + x; i++ ){
                //회색인 경우 Skip
                if(current[i] == 2){
                    continue;
                }
                else{
                    if(color == 1){
                        //검은색인 경우
                        cntB[i] += 1;
                    }
                    else{
                        //흰색인 경우
                        cntW[i] += 1;
                    }
                    
                    if(cntW[i] >= 2 && cntB[i] >= 2){
                        current[i] = 2;
                    }
                    else{
                        current[i] = color;
                    }
                }
            }

            idx = (d == 'L') ? idx : idx + x - 1;
        }

        int cntBlack = 0;
        int cntGray = 0;
        int cntWhite = 0;

        for(int i = 0; i < 200001; i++){
            int color = current[i];

            if(color == 1){
                cntBlack += 1;
            }
            else if(color == -1){
                cntWhite += 1;
            }
            else if(color == 2){
                cntGray += 1;
            }

        }

        System.out.printf("%d %d %d", cntWhite, cntBlack, cntGray);
    }
}