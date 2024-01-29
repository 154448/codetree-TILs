import java.util.Scanner;

public class Main {
    public static int getTotalDay(int m){
        //1 ~ 7월까지 : 홀수 31일, 짝수 30일
        if(m / 8 == 0){
            if(m % 2 == 0){
                if(m == 2){
                    return 28;
                }
                else{
                    return 30;
                }
            }
            else{
                return 31;
            }
        }
        else{
            if(m % 2 == 0){
                return 31;
            }
            else{
                return 30;
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int m1 = userIn.nextInt();
        int d1 = userIn.nextInt();

        int m2 = userIn.nextInt();
        int d2 = userIn.nextInt();

        int totDay = 0;

        for(int m = m1; m < m2; m++){
            totDay += getTotalDay(m);
        }

        totDay += (d2 - d1 + 1);

        System.out.printf("%d", totDay);
    }
}