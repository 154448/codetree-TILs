import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String start = userIn.next();
        
        String right = start;
        String left = start;
        
        String answer = userIn.next();

        int cntR = 0;
        int cntL = 0;

        while(true){
            if(cntR == start.length()){
                System.out.printf("%d", -1);
                break;   
            }

            cntR += 1;
            right = right.charAt(right.length() - 1) + right.substring(0, right.length() - 1);

            cntL -= 1;
            left = left.substring(1) + left.charAt(0);

            if(right.equals(answer)){
                System.out.printf("%d", cntR);
                break;
            }
            else if(left.equals(answer)){
                System.out.printf("%d", cntL);
                break;
            }
        }

        
    }
}