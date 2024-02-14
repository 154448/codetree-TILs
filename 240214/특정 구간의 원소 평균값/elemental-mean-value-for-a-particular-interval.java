import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }

        int cnt = 0;

        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                double sum = 0;

                for(int i = s; i <= e; i++){
                    sum += nums[i];
                }

                double avg = sum / (e - s + 1);

                

                for(int i = s; i <= e; i++){
                    if(avg== (double)nums[i]){
                        cnt += 1;
                        break;
                    }
                }

            }
        }

        System.out.printf("%d", cnt);


    }
}