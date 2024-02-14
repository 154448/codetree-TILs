import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        char[] people = new char[101];

        int n = userIn.nextInt();

        for(int i = 0; i < n; i++){
            int idx = userIn.nextInt();
            people[idx] = userIn.next().charAt(0);
        }

        int maxLength = 0;

        for(int s = 0; s < 100; s++){
            if(people[s] == 'G' || people[s] == 'H'){
                for(int e = s + 1; e < 101; e++){
                    if(people[e] == 'G' || people[e] == 'H'){
                        int cntG = 0;
                        int cntH = 0;

                        for(int i = s; i <= e; i++){
                            char now = people[i];

                            if(now == 'G'){
                                cntG += 1;
                            }

                            else if(now == 'H'){
                                cntH += 1;
                            }

                        }

                        if(cntG == cntH){
                            maxLength = Math.max(maxLength, e - s);
                        }
                    }
                }
            }

            
        }

        System.out.printf("%d", maxLength);
    }
}