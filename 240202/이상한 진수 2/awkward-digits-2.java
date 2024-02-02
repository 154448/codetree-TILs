import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String num = userIn.next();

        int digit = num.length() - 1;
        int tot = 0;
        int cnt = 0;

        boolean isChange = false;

        for(int i = 0; i < num.length(); i++){
            int res = num.charAt(i) - '0';

            if(res == 1){
                cnt += 1;
            }

            if(!isChange && res == 0){
                res = 1;
                isChange = true;
            }

            tot += (Math.pow(2, digit) * res);
            digit -= 1;
        }

        if(cnt == num.length()){
            tot -= 1;
        }

        System.out.printf("%d", tot);
    }
}