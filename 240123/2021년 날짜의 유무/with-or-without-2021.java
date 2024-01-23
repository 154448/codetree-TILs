import java.util.Scanner;

public class Main {
    public static String isDate(int m, int d){
        String res = "No";

        if(m >= 1 && m <= 12){
            if(m % 2 == 1){
                //31일인 경우
                res = d <= 31 ? "Yes" : "No";
            }
            else{
                if(m == 2){
                    res = d <= 28 ? "Yes" : "No";
                }
                else{
                    res = d <=30 ? "Yes" : "No";
                }
            }
        }
        else{
            if(m % 2 == 0){
                //31일인 경우
                res = d <= 31 ? "Yes" : "No";
            }
            else{
                res = d <=30 ? "Yes" : "No";
            }
        }

        return res;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int m = userIn.nextInt();
        int d = userIn.nextInt();

        System.out.printf("%s", isDate(m, d));
    }
}