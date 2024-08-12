import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int t = userIn.nextInt();

        int[] firstLine = new int[n];
        int[] secondLine = new int[n];

        for(int i = 0; i < n; i++){
            firstLine[i] = userIn.nextInt();
        }
        for(int i = 0; i < n; i++){
            secondLine[i] = userIn.nextInt();
        }

        for(int c = 0; c < t; c++){
            int[] tmpFirst = new int[n];
            int[] tmpSecond = new int[n];

            tmpFirst[0] = secondLine[n - 1];
            tmpSecond[0] = firstLine[n - 1];

            for(int i = 1; i < n; i++){
                tmpFirst[i] = firstLine[i - 1];
                tmpSecond[i] = secondLine[i - 1];
            }

            firstLine = tmpFirst;
            secondLine = tmpSecond;
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", firstLine[i]);
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", secondLine[i]);
        }
    }
}