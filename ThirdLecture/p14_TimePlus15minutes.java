import java.util.Scanner;

public class p14_TimePlus15minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int hoursPlusMinutes = (hours*60) + minutes + 15;
        hours = hoursPlusMinutes/60;
        if (hours > 23) {
            hours = hours % 24;
        }
        minutes = hoursPlusMinutes % 60;
        System.out.printf("%d:%02d", hours, minutes);
        }

}
