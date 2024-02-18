import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] ability = new int[6];

        for(int i = 0; i < 6; i++){
            ability[i] = userIn.nextInt();
        }

        Arrays.sort(ability);

        int[] teamAbility = {ability[0] + ability[5], ability[1] + ability[4], ability[2] + ability[3]};

        Arrays.sort(teamAbility);

        System.out.printf("%d", teamAbility[2] - teamAbility[0]);


    }
}