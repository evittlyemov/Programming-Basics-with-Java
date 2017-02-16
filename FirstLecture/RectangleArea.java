import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double a = Double.parseDouble(console.nextLine());

        double b = Double.parseDouble(console.nextLine());

        double RectangleArea = a*b;
        System.out.println(RectangleArea);
    }
}
