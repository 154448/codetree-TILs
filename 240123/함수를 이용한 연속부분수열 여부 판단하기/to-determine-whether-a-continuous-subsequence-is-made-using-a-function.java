import java.util.Scanner;

public class Main {
    public static String isRight(int[] firstNums, int[] secondNums){
        int idx = 0;
        int an = secondNums.length;

        for(int i = 0; i < firstNums.length; i++){
            if(firstNums[i] == secondNums[idx]){
                idx += 1;

                if(idx == an){
                    return "Yes";
                }
            }
            else{
                idx = 0;
            }

        }

        return "No";
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int first = userIn.nextInt();
        int second = userIn.nextInt();

        int[] firstNums = new int[first];
        int[] secondNums = new int[second];

        for(int i = 0; i < first; i++){
            firstNums[i] = userIn.nextInt();
        }

        for(int i = 0; i < second; i++){
            secondNums[i] = userIn.nextInt();
        }

        System.out.printf("%s", isRight(firstNums, secondNums));
    }
}