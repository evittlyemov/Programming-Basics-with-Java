import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumbers = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nNumbers; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            leftSum += currentNumber;
        }
        for (int i = 0; i < nNumbers; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            rightSum+= currentNumber;

        }
        boolean isEqual = leftSum == rightSum;

        if(isEqual){
            System.out.println("Yes, sum = " + leftSum);
        } else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.println("No, diff = " + diff);
        }
    }
}
