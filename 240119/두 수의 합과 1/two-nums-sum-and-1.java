import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        n += userIn.nextInt();

        String str = Integer.toString(n);

        int cnt = 0;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c == '1'){
                cnt += 1;
            }

        }

        System.out.printf("%d", cnt);
        
    }
}