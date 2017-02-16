import java.util.Scanner;

public class p07_2DRectangleArea {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	double x1 = Double.parseDouble(scanner.nextLine());
	double y1 = Double.parseDouble(scanner.nextLine());
	double x2 = Double.parseDouble(scanner.nextLine());
    double y2 = Double.parseDouble(scanner.nextLine());

    double width = Math.abs(x1 - x2);
    double height = Math.abs(y1 - y2);

    double area = width * height;
    double perimeter = (width + height) * 2;

        System.out.println(area);
        System.out.println(perimeter);

    }
}
