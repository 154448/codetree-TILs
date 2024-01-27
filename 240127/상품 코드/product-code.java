import java.util.Scanner;

class Product{
    String name;
    int code;

    public Product(String name, int code){
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner userIn = new Scanner(System.in);

        String productName = userIn.next();
        int productCode = userIn.nextInt();

        Product product1 = new Product("codetree", 50);
        Product product2 = new Product(productName, productCode);

        System.out.printf("product %d is %s\n", product1.code, product1.name);
        System.out.printf("product %d is %s", product2.code, product2.name);

    }
}