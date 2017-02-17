import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int nPairs = Integer.parseInt(scanner.nextLine());
        int currentSum = 0;
        int lastSum = 0;
        int sumDifference = 0;
        int maxPairSum = 0;

        for (int i = 0; i < nPairs ; i++) {
            for (int j = 0; j < 2; j++) {
                int currentNumber = Integer.parseInt(scanner.nextLine());
                currentSum += currentNumber;
            }
            if (i > 0) {
                sumDifference = Math.abs(currentSum - lastSum);
                maxPairSum = Math.max(maxPairSum, sumDifference);
            }
            lastSum = currentSum;
            currentSum = 0;
        }
        if (maxPairSum == 0){
            System.out.println("Yes, value=" + lastSum);
        } else {
            System.out.println("No, maxdiff=" + maxPairSum);
        }
    }
}
