import java.util.Scanner;

public class Main {
    public static boolean isDuplicate(int[] arr){
        int n = arr.length;

        boolean res = false;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    res = true;
                    break;
                } 
            }
        }

        return res;

    }

    public static int findDiff(int[] arr){
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        return(max - min);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int[] ability = new int[5];
        int tot = 0;

        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < 5; i++){
            int now = userIn.nextInt();
            ability[i] = now;
            tot += now;
        }


        //s : 한 명인 팀
        for(int s = 0; s < 5; s++){
            for(int i = 0; i < 5; i++){
                if(i == s){
                    continue;
                }
                else{
                    for(int j = i + 1; j < 5; j++){
                        if(j == s){
                            continue;
                        }
                        else{
                            int team = ability[i] + ability[j];
                            int[] teamAbility = {ability[s], team, tot - ability[s] - team};

                            if(isDuplicate(teamAbility)){
                                continue;
                            }
                            else{
                                int currentDiff = findDiff(teamAbility);
                                diff = Math.min(diff, currentDiff);
                            }
                        }
                    }

                }
                
            }

        }

        System.out.printf("%d", diff == Integer.MAX_VALUE ? -1 : diff);
    }
}