import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();
        String str = userIn.next();

        int lengthM = 0;

        for(int s = 0; s < n - 1; s++){
            for(int e = s + 1; e < n; e++){
                String now = str.substring(s, e + 1);
               

                boolean tmp = false;
                int idx = 0;

                for(int i = s + 1; i < n; i++){
                    if(idx < now.length() && str.charAt(i) == now.charAt(idx)){
                        idx += 1;
                        tmp = true;
                    }
                    else{
                        if(idx == now.length()){
                            lengthM = Math.max(lengthM, now.length());
                        }
                        idx = 0;
                        tmp = false;
                    }
                }
                if(idx == now.length()){
                    lengthM = Math.max(lengthM, now.length());
                }
            }
        }

        System.out.printf("%d", lengthM + 1);
    }
}