import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p14_1000days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();

        DateTimeFormatter bdf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(birthday, bdf);
        date = date.plusDays(1000);
        String datef = date.format(bdf);
        System.out.println(datef);
    }
}
