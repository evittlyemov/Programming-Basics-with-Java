import java.util.Scanner;

public class SquareOfStars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {       //Top
           System.out.print("*");           //Top
        }                                   //Top
        System.out.println();               //NextLine
        for (int i = 0; i < n-2; i++) {     //Sides
            System.out.print("*");          //RightSide
            for (int j = 0; j < n-2; j++) { //Spaces
               System.out.print(" ");       //Spaces
            }                               //Spaces
            System.out.print("*");          //LeftSide
            System.out.println();           //LeftSide
        }                                   //Sides
        for (int i = 0; i < n; i++) {       //Bottom
            System.out.print("*");          //Bottom
        }                                   //Bottom
    }
}
