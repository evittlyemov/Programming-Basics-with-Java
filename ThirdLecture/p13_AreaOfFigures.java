import java.util.Scanner;

public class p13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double lengths = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",(lengths * lengths));
        } else if (figure.equals("rectangle")) {
            double length1 = Double.parseDouble(scanner.nextLine());
            double length2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",(length1 * length2));
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (Math.PI * radius*radius));
        } else if (figure.equals("triangle")) {
            double lengtht = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (lengtht * height/2));
        }
    }
}
