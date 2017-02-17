import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int diff = 0;

        for (int i = 1; i <= nNumbers; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if (currentNumber > largest) {
                largest = currentNumber;
            }

        }
        if (largest == sum - largest) {
            System.out.println("Yes");
            System.out.println("Sum = " + largest);
        } else {
            diff = Math.abs(largest - (sum - largest));
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }

}
