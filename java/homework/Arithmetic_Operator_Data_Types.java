package homework;

public class Arithmetic_Operator_Data_Types {
    public static void main(String[] args) {

        //to use all the data types.
        //and do given arithmetic operations.

        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;

        float e = 50;
        double f = 60.60;

        char g = 'H';
        String s = "All arithmetic operations are bellow";

        boolean i = true;


        System.out.println("----" + s + "----");
        long sum = a + b;
        System.out.println("sum is : " + sum);

        int subtraction = b - a ;
        System.out.println("subtraction is : " + subtraction);

        float multiplication = a * b;
        System.out.println("multiplication is :" + multiplication);

        double division = f / a ;
        System.out.println("division is :" + division);

        double reminder = d % a ;
        System.out.println("reminder is : " + reminder);

    }
}
