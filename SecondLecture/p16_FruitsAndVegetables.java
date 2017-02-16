import java.util.Scanner;

public class p16_FruitsAndVegetables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N = Double.parseDouble(scanner.nextLine()); //Without any ranges. Printing is important!
        double M = Double.parseDouble(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        double iV = N * x;
        double iF = M * y;
        double total = iV + iF;
        double totalEUR = total / 1.94;
        System.out.printf("%.13f", totalEUR);

    }
}
