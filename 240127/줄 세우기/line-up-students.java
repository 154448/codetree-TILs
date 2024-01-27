import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    public Student(int h, int w, int n){
        this.height = h;
        this.weight = w;
        this.num = n;
    }

    @Override
    public int compareTo(Student other){
        if(this.height != other.height){
            return other.height - this.height;
        }
        else if(this.weight != other.weight){
            return other.weight - this.weight;
        }
        return this.num - other.num;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        int n = userIn.nextInt();

        Student[] students = new Student[n];

        for(int i = 1; i <= n; i++){
            students[i - 1] = new Student(userIn.nextInt(), userIn.nextInt(), i);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            Student s = students[i];
            System.out.printf("%d %d %d \n", s.height, s.weight, s.num);
        }
    }
}