import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        double[] score = double[n];

        double tot = 0;

        for(int i = 0; i < n; i++){
            tot += score[i];
        }

        double avg = tot / n;

        if(avg > 4.0){
            System.out.print("Perfect");
        }
        else if(avg > 3.0){
            System.out.print("Good");
        }
        else{
            System.out.print("Poor");
        }
    }
}