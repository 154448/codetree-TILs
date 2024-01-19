import java.util.Scanner;

public class Main {
    public static void printNOne(int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%d", 1);
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int m = userIn.nextInt();

        printNOne(n, m);

    }
}