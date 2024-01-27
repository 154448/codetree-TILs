import java.util.Scanner;

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
        int[] transferIdx = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = new Num(userIn.nextInt(), i);
        }

        for(int i = 0; i < n; i++){
            //최대값 찾기 시작
            int maxValue = 0;
            int idx = -1;

            for(int j = 0; j < n - i; j++){
                if(maxValue < nums[j].value){
                    maxValue = nums[j].value;
                    idx = j;
                }
            }

            Num tmp = nums[n - i - 1];
            nums[n - i - 1] = nums[idx];
            nums[idx] = tmp;

            transferIdx[nums[n - i - 1].getFirstIdx()] = n - i;
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", transferIdx[i]);
        }
    }
}