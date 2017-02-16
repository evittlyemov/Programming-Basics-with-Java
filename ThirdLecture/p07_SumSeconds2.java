import java.util.Scanner;

public class p07_SumSeconds2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());
        int sum = time1 + time2 + time3;

        int minutes = sum / 60;
        int seconds = sum % 60; // става само остатъка от делението.
        System.out.printf("%d:%02d", minutes, seconds);

    }
}
