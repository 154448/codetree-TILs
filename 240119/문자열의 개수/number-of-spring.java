import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int cnt = 0;

        String res = "";

        while(true){
            String str = userIn.next();

            if(str.equals("0")){
                break;
            }
            else{
                cnt += 1;
                if(cnt % 2 == 1){
                    res += (str + "\n");
                }
            }
        }

        System.out.printf("%d\n%s", cnt, res);
    }
}