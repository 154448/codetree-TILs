import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String s = userIn.next();
        int n = userIn.nextInt();

        for(int j = 0; j < n; j++){
            int q = userIn.nextInt();

            String newStr = "";

            if(q == 1){
                int a = userIn.nextInt() - 1;
                int b = userIn.nextInt() - 1;
                
                int first = a > b ? b : a;
                int last = a < b ? b : a;

                newStr += s.substring(0, first);
                newStr += s.charAt(last);
                newStr += s.substring(first + 1, last);
                newStr += s.charAt(first);
                newStr += s.charAt(last + 1);
            }
            else if(q == 2){
                char key = userIn.next().charAt(0);
                char value = userIn.next().charAt(0);

                for(int i = 0; i < s.length(); i++){
                    newStr += s.charAt(i) == key ? value : s.charAt(i);
                }

            }

            System.out.printf("%s\n", newStr);

            s = newStr;
        }
    }
}