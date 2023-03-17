package homework;

public class While_Loop_Even_Odd {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int num = 1;

        while (evenCount < 10 || oddCount < 10) {
            if (num % 2 == 0 && evenCount < 10) {
                System.out.print(num + " ");
                evenCount++;
            } else if (num % 2 != 0 && oddCount < 10) {
                System.out.print(num + " ");
                oddCount++;
            }
            num++;
        }
    }
}
