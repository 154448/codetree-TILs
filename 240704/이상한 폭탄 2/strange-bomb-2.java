import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int k = userIn.nextInt();

        int[] bomb = new int[n];

        for(int i = 0; i < n; i++){
            bomb[i] = userIn.nextInt();
        }

        int result = -1;

        for(int i = 0; i < n - 1; i++){
            int target = bomb[i];

            int end = ((i + 4) < n)? i + 4 : n;

            for(int j = i + 1; j < end; j++){
                if(target == bomb[j]){
                    result = Math.max(result, target);
                }
            }
        }

        System.out.println(result);
    }
}