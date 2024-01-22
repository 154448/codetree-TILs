import java.util.Scanner;

public class Main {
    public static boolean isMagicNum(int n){
        String numStr = String.valueOf(n);

        boolean res = false;

        if(n % 3 == 0){
            res = true;
        }
        else{
            for(int i = 0; i < numStr.length(); i++){
                char c = numStr.charAt(i);

                if(c == '3' || c == '6' || c == '9'){
                    res = true;
                }
            }
        }
        return res;
    }


    public static int countThree(int a, int b){
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isMagicNum(i)){
                cnt += 1;
            }
        }
        

        return cnt;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();

        System.out.printf("%d", countThree(a, b));
    }
}