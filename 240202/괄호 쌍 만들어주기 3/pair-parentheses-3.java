import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String command = userIn.nextLine();

        int n = command.length();

        int[] open = new int[n];
        int[] close = new int[n];

        for(int i = 0; i < n; i++){
            char c = command.charAt(i);
            if(i == 0){
                if(c == '('){
                    open[0] = 1;
                }
                else{
                    close[0] = 1;
                }
            }
            else{
                if(c == '('){
                    open[i] = open[i - 1] + 1;
                    close[i] = close[i - 1];
                }
                else{
                    open[i] = open[i - 1];
                    close[i] = close[i - 1] + 1;
                }
            }
        }

        int tot = 0;

        for(int i = n - 1; i >= 0; i--){
            if(command.charAt(i) == ')'){
                tot += open[i];
            }
        }

        System.out.printf("%d", tot);
    }
}