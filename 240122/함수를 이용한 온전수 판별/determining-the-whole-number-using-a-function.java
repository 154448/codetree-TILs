import java.util.Scanner;

public class Main {
    public static boolean isMagicNum(int n){
        boolean res = false;

        if(n % 2 == 0){
            return false;
        }
        else{
            res = true;
        }

        if(n % 10 == 5){
            return false;
        }
        else{
            res = true;
        }

        if(n % 3 == 0 && n % 9 != 0){
            return false;
        }
        else{
            res = true;
        }

        return res;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();

        int cnt = 0;

        for(int i = a; i <= b; i++){

            cnt += isMagicNum(i) ? 1 : 0;

        }


        System.out.printf("%d", cnt);
    }
}