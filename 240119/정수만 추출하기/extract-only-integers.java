import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String a = userIn.next();
        String b = userIn.next();

        int tmp = 0;
        int tot = 0;

        for(int i = 0; i < a.length(); i++){
            int n = (int)a.charAt(i);
            
            if(n >= 48 && n <= 57){
                tmp *= 10;
                tmp += (n - 48);
            }
            else{
                break;
            }
        }

        tot += tmp;
        tmp = 0;

        for(int i = 0; i < b.length(); i++){
            int n = (int)b.charAt(i);
            
            if(n >= 48 && n <= 57){
                tmp *= 10;
                tmp += (n - 48);
            }
            else{
                break;
            }
        }

        tot += tmp;

        System.out.printf("%d", tot);
    }
}