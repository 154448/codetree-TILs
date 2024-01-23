import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int n){
        this.value = n;
    }
}

public class Main {
    public static void chageNum(IntWrapper a, IntWrapper b){
        if(a.value > b.value){
            a.value += 25;
            b.value *= 2;
        }
        else{
            b.value += 25;
            a.value *= 2;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();

        IntWrapper a_w = new IntWrapper(a);
        IntWrapper b_w = new IntWrapper(b);

        chageNum(a_w, b_w);

        System.out.printf("%d %d", a_w.value, b_w.value);

    }
}