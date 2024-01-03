import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int cnt = 0;

        for(int i = 0; i < n; i++){
            int[] score = new int[4];
            for(int j = 0; j < 4; j++){
                score[j] = userIn.nextInt();
            }

            int tot = 0;

            for(int j = 0; j < 4; j++){
                tot += score[j];
            }

            if(tot >= 240){
                System.out.println("pass");
                cnt += 1;
            }
            else{
                System.out.println("fail");
            }
        }

        System.out.println(cnt);
    }
}