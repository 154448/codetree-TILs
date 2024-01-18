import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String target1 = "ee";
        int cnt1 = 0;
        String target2 = "ab";
        int cnt2 = 0;

        String str = userIn.next();

        for(int i = 0; i < str.length(); i++){
            char tmp = str.charAt(i);

            if(cnt1 < 2){
                if(tmp == target1.charAt(cnt1)){
                    cnt1 += 1;
                }
                else{
                    cnt1 = 0;
                }

            }

            if(cnt2 < 2){
                if(tmp == target2.charAt(cnt2)){
                    cnt2 += 1;
                }
                else{
                    cnt2 = 0;
                }

            }


        }

        System.out.printf("%s %s", cnt1==2?"Yes":"No", cnt2==2?"Yes":"No");
    }
}