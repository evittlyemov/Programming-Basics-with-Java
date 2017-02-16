import java.util.Scanner;

public class p15_ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());

        if (num1 == num2 && num2 == num3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
