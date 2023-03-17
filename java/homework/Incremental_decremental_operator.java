package homework;

public class Incremental_decremental_operator {
    public static void main(String[] args) {
        int a = 60;
        int b = 40;

        int sum = a + b ;
        System.out.println("sum is : " + sum);

        int sub = a - b ;
        System.out.println("subtraction is : " + sub);

        int mul = a * b ;
        System.out.println("Multiplication is : " + mul);

        int div = a / b ;
        System.out.println("division is :" + div);

        a++;
        int increment = a;
        System.out.println("Incremental operator value is :" + increment);

        b--;
        int decrement = b;
        System.out.println("Decremental operator value is :" + decrement);

        ++a;
        int preincrement = a;
        System.out.println("pre-incremental value is: " + preincrement);

        --b;
        int predecrement = b;
        System.out.println("pre-decrementtal value is : " + predecrement);

    }
}
