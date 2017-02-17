import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nTimes = Integer.parseInt(scanner.nextLine());
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < nTimes; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (minNumber > currentNumber){
                minNumber = currentNumber;
            }

        }
        System.out.println(minNumber);

    }
}
