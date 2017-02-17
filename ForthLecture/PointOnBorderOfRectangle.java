import java.util.Scanner;

public class PointOnBorderOfRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean isOnTop = (x >= x1 && x <= x2) && (y==y1);
        boolean isOnBottom = (x >= x1 && x <= x2) && (y==y2);
        boolean isOnLeft = (y >= y1 && y <= y2) && (x==x1);
        boolean isOnRight = (y >= y1 && y <= y2) && (x==x2);

        if (isOnTop || isOnBottom || isOnLeft || isOnRight) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
