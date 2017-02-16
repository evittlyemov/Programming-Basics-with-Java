import java.util.Scanner;

public class p11_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());
        double deg = rad * 180/Math.PI;

        System.out.println(Math.round(deg));
    }
}
