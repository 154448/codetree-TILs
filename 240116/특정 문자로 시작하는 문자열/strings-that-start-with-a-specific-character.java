import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        int cnt = 0;
        int length = 0;

        String[] word = new String[n];

        for(int i = 0; i < n; i++){
            word[i] = userIn.next();
        }
        char target = userIn.next().charAt(0);


        for(int i = 0; i < n; i++){
            String tmp = word[i];

            if(tmp.charAt(0) == target){
                length += tmp.length();
                cnt += 1;
            }
        }

        System.out.printf("%d %.2f", cnt, (double)length / cnt);
    }
}