package homework;

public class Do_While_Even_Odd {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;

        do {
            number++;
            if (number % 2 == 0 && count < 10) {
                System.out.println(number);
                count++;
            } else if (number % 2 != 0 && count >= 10) {
                System.out.println(number);
                count++;
            }
        } while (count < 20);
    }
}
