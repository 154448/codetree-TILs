import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        char[] user = userIn.next().toCharArray();

        int maxDist = 0;

        for(int i = 0; i < n; i++){
            if(user[i] == '1'){
                continue;
            }
            else{
                char[] tmp = user.clone();
                tmp[i] = '1';

                int minDist = n;

                boolean isRight = true;

                boolean isExit = false;
                int lastIdx = -1;

                for(int j = 0; j < n; j++){
                    if(tmp[j] == '1'){
                        if(isExit){
                            if(j - lastIdx == 1){
                                isRight = false;
                                break;
                            }
                            else{
                                minDist = Math.min(minDist, j - lastIdx);
                            }
                        }
                        else{
                            isExit = true;
                        }
                        lastIdx = j;
                    }
                }
                if(isRight){
                    maxDist = Math.max(minDist, maxDist);
                }

            }
        }

        System.out.printf("%d", maxDist);

    }
}