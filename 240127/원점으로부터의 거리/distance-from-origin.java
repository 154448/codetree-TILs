import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point>{
    int x; 
    int y;
    int distance;
    int num;

    public Point(int x, int y, int n){
        this.x = x;
        this.y = y;
        this.num = n;
        this.distance = Math.abs(x - 0) + Math.abs(y + 0);
    }

    @Override
    public int compareTo(Point other){
        if(this.distance != other.distance){
            return this.distance - other.distance;
        }
        return this.num - other.num;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        Point[] points = new Point[n];

        for(int i = 0; i < n; i++){
            points[i] = new Point(userIn.nextInt(), userIn.nextInt(), i + 1);
        }

        Arrays.sort(points);

        for(int i = 0; i < n; i++){
            System.out.printf("%d\n", points[i].num);
        }
    }
}