import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();
        String key = userIn.next();

        int idx = 0;
        int res = -1;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == key.charAt(idx)){
                idx += 1;
                
                if(idx == key.length()){
                    res = 7 - idx + 1;
                    break;
                }
            }

        }
        System.out.printf("%d", res);
    }
}