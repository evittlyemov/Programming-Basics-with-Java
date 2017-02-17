import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfProjection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (typeOfProjection) {
            case "Premiere":
                price = 12;
                System.out.printf("%.2f leva", (row * column * price));
                break;
            case "Normal":
                price = 7.50;
                System.out.printf("%.2f leva", (row * column * price));
                break;
            case "Discount":
                price = 5;
                System.out.printf("%.2f leva", (row * column * price));
                break;
        }
    }
}
