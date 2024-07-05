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

            // System.out.println(nums);

            int changeCount = 0;
            char current = nums[0];
            
            //2개의 수로만 구성된 것
            for(int j = 1; j < tmp.length(); j++){
                if(nums[j] != current){
                    changeCount += 1;
                    current = nums[j];
                }
            }
            
            int count = 0;
            current = nums[0];
            if(changeCount == 1){
                for(int j = 0; j < tmp.length(); j++){
                    if(nums[j] == current){
                        count += 1;
                    }
                    else{
                        current = nums[j];

                        if(count == 1){
                            result += 1;
                        }

                        count = 1;
                    }
                }

                //마지막 숫자만 변하는 경우
                if(count == 1){
                    result += 1;
                }
            }
        }

        System.out.printf("%d", result);
    
    }
}