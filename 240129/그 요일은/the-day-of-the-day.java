import java.util.Scanner;

public class Main {
    public static int getMonthDays(int m){
        if(m / 8 == 0){
            return m % 2 == 0 ? (m == 2 ? 29 : 30) : 31;
        }
        else{
            return m % 2 == 1 ? 30 : 31;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = userIn.nextInt();
        int d1 = userIn.nextInt();

        int m2 = userIn.nextInt();
        int d2 = userIn.nextInt();

        String target = userIn.next();

        int totDay = d2 - d1;

        for(int m = m1; m < m2; m++){
            totDay += getMonthDays(m);
        }

        int res = totDay / 7;

        for(int i = 0; i <= totDay % 7; i++){
            if(target.equals(days[i])){
                res+=1;
                break;
            }
        }

        System.out.printf("%d", res);


    }
}