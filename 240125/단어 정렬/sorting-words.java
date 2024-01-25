import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        String[] words = new String[n];

        for(int i = 0; i < n; i++){
            words[i] = userIn.next();
        }

        Arrays.sort(words);

        for(int i = 0; i < n; i++){
            System.out.printf("%s\n", words[i]);
        }


    }
}