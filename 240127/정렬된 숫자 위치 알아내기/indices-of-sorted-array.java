import java.util.Scanner;
import java.util.Arrays;

class Num implements Comparable<Num>{
    int value;
    int firstIdx;


    public Num(int value, int i){
        this.value = value;
        this.firstIdx = i;
    }

    public int compareTo(Num other){
        return this.value - other.value;
    }

    public int getValue(){
        return value;
    }

    public int getFirstIdx(){
        return firstIdx;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        Num[] nums = new Num[n];

        for(int i = 0; i < n; i++){
            nums[i] = new Num(userIn.nextInt(), i);
        }

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", nums[i].getFirstIdx() + 1);
        }
    }
}