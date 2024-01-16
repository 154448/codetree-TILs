import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        String[] strs = new String[n];

        for(int i = 0; i < n; i++){
            strs[i] = userIn.next();
        }

        int tot = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            tot += strs[i].length();

            if(strs[i].charAt(0) == 'a'){
                cnt += 1;
            }
        }

        System.out.printf("%d %d", tot, cnt);
    }
}