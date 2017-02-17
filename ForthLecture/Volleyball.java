import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String kindOfYear = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int homeDays = Integer.parseInt(scanner.nextLine()); // equals to plays in home town

        int weekends = 48;
        double weekendsInSofia = 0.75*(weekends - homeDays);
        double holidayPlays = (holidays*2)/3;       // plays during holiday
        double plays = holidayPlays + weekendsInSofia + homeDays;

        if (kindOfYear.equals("leap")) {
            plays = plays + plays*0.15;
            System.out.printf("%.0f",Math.abs(plays));
        } else if (kindOfYear.equals("normal")) {
            System.out.printf("%.0f",Math.abs(plays));
        }
    }
}
