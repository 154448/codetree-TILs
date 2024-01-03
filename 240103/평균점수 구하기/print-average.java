import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        double[] score = new double[8];
        double tot = 0;

        for(int i = 0 ;i < 8; i++){
            score[i] = userIn.nextDouble();
        }

        for(int i = 0; i < 8; i++){
            tot += score[i];
        }

        System.out.printf("%.1f", (double)tot / 8);

    }
}