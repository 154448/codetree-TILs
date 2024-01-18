import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();
        int n = userIn.nextInt();

        for(int i = 0; i < n; i++){
            int q = userIn.nextInt();
            String newStr = "";

            if(q == 1){
                newStr += str.substring(1) + str.charAt(0);
            }
            else if(q == 2){
                newStr += str.charAt(str.length() - 1)+ str.substring(0, str.length() - 1);
            }
            else if(q == 3){
                    StringBuffer sb = new StringBuffer(str);
                    newStr = sb.reverse().toString();
            }
            System.out.printf("%s\n", newStr);

            str = newStr;
        }
    }
}