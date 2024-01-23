import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int n){
        this.value = n;
    }
}

public class Main {
    public static void swapIntWrapper(IntWrapper a, IntWrapper b){
        if(a.value > b.value){
            a.value *= 2;
            b.value += 10;
        }
        else{
            b.value *= 2;
            a.value += 10;
        }
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int a = userIn.nextInt();
        int b = userIn.nextInt();

        IntWrapper a_w = new IntWrapper(a);
        IntWrapper b_w = new IntWrapper(b);

        swapIntWrapper(a_w, b_w);

        System.out.printf("%d %d", a_w.value, b_w.value);
    }
}