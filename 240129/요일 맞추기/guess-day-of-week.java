import java.util.Scanner;

public class Main {
    public static int getMonthDay(int m){
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
            if(m % 2 == 1){
                return 30;
            }
            else{
                return 31;
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String[] days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = userIn.nextInt();
        int d1 = userIn.nextInt();

        int m2 = userIn.nextInt();
        int d2 = userIn.nextInt();

        int totDay = 0;

        for(int m = m1; m < m2; m++){
            totDay += getMonthDay(m);
        }

        totDay += (d2 - d1);

        int res = totDay % 7;

        if(totDay < 0){
            res += 7;
        }

        System.out.printf("%s", days[res]);
    }
}