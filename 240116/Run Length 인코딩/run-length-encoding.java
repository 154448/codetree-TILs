import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();

        int len = str.length();

        int cnt = 0;
        char target = 'A';
        String res = "";
        for(int i = 0; i < len; i++){
            if(str.charAt(i) == target){
                cnt += 1;
            }
            else{
                if(i != 0){
                   res += target;
                   res += cnt; 
                }
                target = str.charAt(i);
                cnt = 1;
            }
        }

        res += target;
        res += cnt;

        System.out.printf("%d\n%s", res.length(), res);
    }
}