import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score: ");
        int num = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0;
        if (num <= 100){
            bonusScore = 5;
        } else if (num > 100 && num <= 1000) {
            bonusScore = num * 0.2;
        } else if (num > 1000) {
            bonusScore = num * 0.1;
        }
        if (num % 2 == 0){
            bonusScore += 1;
        }
        if (num % 10 == 5){
            bonusScore += 2;
        }
        System.out.println("Bonus score: " + bonusScore);
        System.out.println("Total score: " + (num + bonusScore));
    }
}
