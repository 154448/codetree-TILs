import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int cntA = userIn.nextInt();
        int cntB = userIn.nextInt();

        int[] a = new int[cntA];
        int[] b = new int[cntB];

        for(int i = 0; i < cntA; i++){
            a[i] = userIn.nextInt();
        }
        for(int i = 0; i < cntB; i++){
            b[i] = userIn.nextInt();
        }

        int idx = 0;

        for(int i = 0; i < cntA; i++){
            if(a[i] == b[idx]){
                idx += 1;
                if(idx == cntB){
                    break;
                }
            }
            else{
                idx = 0;
            }

        }

        System.out.println(idx == cntB ? "Yes" : "No");
    }
}