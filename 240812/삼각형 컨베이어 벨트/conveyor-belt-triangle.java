import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        int t = userIn.nextInt();

        int[] fLine = new int[n];
        int[] sLine = new int[n];
        int[] tLine = new int[n];

        for(int i = 0; i < n; i++){
            fLine[i] = userIn.nextInt();
        }

        for(int i = 0; i < n; i++){
            sLine[i] = userIn.nextInt();
        }

        for(int i = 0; i < n; i++){
            tLine[i] = userIn.nextInt();
        }

        for(int c = 0; c < t; c++){
            int[] tmp_f = new int[n];
            int[] tmp_s = new int[n];
            int[] tmp_t = new int[n];

            tmp_f[0] = tLine[n - 1];
            tmp_s[0] = fLine[n - 1];
            tmp_t[0] = sLine[n - 1];

            for(int i = 1; i < n; i++){
                tmp_f[i] = fLine[i - 1];
                tmp_s[i] = sLine[i - 1];
                tmp_t[i] = tLine[i - 1];
            }

            fLine = tmp_f;
            sLine = tmp_s;
            tLine = tmp_t;
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", fLine[i]);
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", sLine[i]);
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", tLine[i]);
        }
    }
}