import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    public Student(int h, int w, int i){
        this.height = h;
        this.weight = w;
        this.num = i + 1;
    }

    @Override
    public int compareTo(Student other){
        if(this.height != other.height){
            return this.height - other.height;
        }
        return other.weight - this.weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);
        int n = userIn.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            students[i] = new Student(userIn.nextInt(), userIn.nextInt(), i);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            Student s = students[i];
            System.out.printf("%d %d %d\n", s.height, s.weight, s.num);
        }


    }
}