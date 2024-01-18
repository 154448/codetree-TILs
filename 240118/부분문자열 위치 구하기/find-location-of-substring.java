import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();
        int idx = 0;

        String target = userIn.next();
        int start = -1;

        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);

            if(current == target.charAt(idx)){
                idx += 1;
                if(idx == target.length()){
                    start = i - target.length() + 1;
                    break;
                }
            }
            else{
                idx = current==target.charAt(0)?1:0;
            }
        }

        System.out.printf("%d", start);


    }
}