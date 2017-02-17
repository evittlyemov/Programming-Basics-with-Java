import java.util.Scanner;

public class PointOnTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        boolean checkIfxyIsInFirstRectangle = (x > 0 && x < 3*h) && (y > 0 && y < h);
        boolean checkifxyIsInSecondRectangle = (x > h && x < 2*h) && (y > 0 && y < 4*h);
        boolean firstCheck = (x <= 0 && y > h) || x > 3*h || (y > h && y > 4*h);
        boolean secondCheck = x < h && y > h;
        boolean thirdCheck = (x > 3*h && y > h) || (y > h && x > 2*h);
        boolean nullCheck = (x < 0) || (y < 0);
        
        if (checkIfxyIsInFirstRectangle || checkifxyIsInSecondRectangle){
            System.out.println("inside");
        } else if (firstCheck || secondCheck || thirdCheck || nullCheck) {
            System.out.println("outside");
        } else
            System.out.println("border");

    }
}
