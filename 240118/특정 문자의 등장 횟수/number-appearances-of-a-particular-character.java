import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String str = userIn.next();

        String target1 = "ee";
        int idx1 = 0;
        int cnt1 = 0;
        String target2 = "eb";
        int idx2 = 0;
        int cnt2 = 0;

        for(int i = 0; i < str.length(); i++){
            char tmp = str.charAt(i);

            if(tmp == target1.charAt(idx1)){
                idx1 += 1;
                if(idx1 == 2){
                    cnt1 += 1;
                    idx1 = 0;
                }
            }

            if(tmp == target2.charAt(idx2)){
                idx2 += 1;
                if(idx2 == 2){
                    cnt2 += 1;
                    idx2 = 0;
                }
            }
        }

        System.out.printf("%d %d", cnt1, cnt2);
    }
}