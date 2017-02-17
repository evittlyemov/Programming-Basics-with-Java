import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nTimes = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < nTimes; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (maxNumber < currentNumber){
                maxNumber = currentNumber;
            }

        }
        System.out.println(maxNumber);

    }
}
