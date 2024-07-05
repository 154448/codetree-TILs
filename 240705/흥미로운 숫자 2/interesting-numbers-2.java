import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int start = userIn.nextInt();
        int end = userIn.nextInt();

        int result = 0;

        for(int i = start; i <= end; i++){
            String tmp = Integer.toString(i);

            char[] nums = new char[tmp.length()];

            for(int j = 0; j < tmp.length(); j++){
                nums[j] = tmp.charAt(j);
            }

            Arrays.sort(nums);

            int changeCount = 0;
            char current = nums[0];

            for(int j = 0; j < tmp.length(); j++){
                if(nums[j] != current){
                    changeCount += 1;
                    current = nums[j];
                }
            }

            if(changeCount == 1){
                result += 1;
            }
        }

        System.out.printf("%d", result);
    
    }
}