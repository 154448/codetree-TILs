import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] length = new int[2];

        int n = userIn.nextInt();
        int nums[] = new int[n];

        nums[0] = userIn.nextInt();
        int current = nums[0] > 0 ? 0 : 1;
        int cnt = 1;
        length[current] = 1;


        for(int i = 1; i < n; i++){
            nums[i] = userIn.nextInt();
            int tmp = nums[i] > 0 ? 0 : 1;

            if(current == tmp){
                cnt += 1;
                if(i == n - 1){
                    length[current] = cnt > length[current] ? cnt : length[current];
                }
            }
            else{
                length[current] = cnt > length[current] ? cnt : length[current];
                
                current = tmp;
                cnt = 1;
            }
        }
        System.out.printf("%d", length[0] > length[1] ? length[0] : length[1]);
    }
}