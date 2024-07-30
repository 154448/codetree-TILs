import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner userIn = new Scanner(System.in);
        //n : 전체 입력 받을 숫자의 수
        int n = userIn.nextInt();
        //nums : 입력받은 숫자를 저장하는 배열
        int[] nums = new int[n];
        //배열의 숫자들을 입력 받음
        for(int i = 0; i < n; i++){
            nums[i] = userIn.nextInt();
        }
        
        //제일 작은 수부터 그 다음으로 작은 수를 차근 차근 찾음
        for(int i = 0; i < n; i++){
            int minIdx = i;
            for(int j = i; j < n; j++){
                if(nums[j] < nums[minIdx]){
                    minIdx = j;
                }
            }

            int tmp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = tmp;
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", nums[i]);
        }
    }
}