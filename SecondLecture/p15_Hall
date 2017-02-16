import java.util.Scanner;

public class p15_Hall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine()); // Input data
        double w = Double.parseDouble(scanner.nextLine()); // Input data
        double deskh = 1.2;                                 // Height of a single desk
        double deskw = 0.7;                                 // Width of a single desk
        if (w >= 3 && h <= 100) {           //3 >= w; h<=100 limits
            if (w <= h) {                   //w <= h limits
                double diff = Math.floor(h / deskh);        // How many desks can fit at entered h
                double diff2 = Math.floor((w - 1) / deskw); // How many desks can fit at entered w
                double desks = Math.floor(diff * diff2);    // How many desks can fit at h x w
                System.out.println(desks - 3);              // Subtracting the 3 desks
            } else {
                System.out.println("Please enter numbers in the range of 3 >= w >= h >= 100!");
            }
        } else {
            System.out.println("Please enter numbers in the range of 3 >= w >= h >= 100!");
        }
    }
}
