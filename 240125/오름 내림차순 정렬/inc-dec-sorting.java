import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = userIn.nextInt();
        }

        Integer[] arr = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(arr);

        Integer[] arr_reverse = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(arr_reverse, Collections.reverseOrder());

        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }

        System.out.println();

        for(int i = 0; i < arr_reverse.length; i++){
            System.out.printf("%d ", arr_reverse[i]);
        }


    }
}