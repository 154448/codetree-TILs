import java.util.Scanner;

public class Main {
    public static String isRight(String str){
        String res = "Yes";

        int lastIdx = str.length() - 1;

        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(lastIdx - i)){
                res = "No";
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();

        System.out.printf("%s", isRight(str));
    }
}