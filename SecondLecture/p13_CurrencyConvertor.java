import java.util.Scanner;

public class p13_CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        String Curr1 = scanner.nextLine();
        String Curr2 = scanner.nextLine();

        double output = 0;
        double cBGN = 1;
        double cUSD = 1.79549;
        double cEUR = 1.95583;
        double cGBP = 2.53405;

        if (Curr1.equals("BGN") & Curr2.equals("USD")) {
            output = input / cUSD;
            System.out.printf("%.2f USD", output);

        } else if (Curr1.equals("BGN") & Curr2.equals("EUR")) {
            output = input / cEUR;
            System.out.printf("%.2f EUR", output);

        } else if (Curr1.equals("BGN") & Curr2.equals("BGN")) {
            output = input;
            System.out.printf("%.2f BGN", output);

        } else if (Curr1.equals("BGN") & Curr2.equals("GBP")) {
            output = input / cGBP;
            System.out.printf("%.2f GBP", output);

        } else if (Curr1.equals("USD") & Curr2.equals("BGN")) {
            output = input * cUSD / cBGN;
            System.out.printf("%.2f BGN", output);

        } else if (Curr1.equals("USD") & Curr2.equals("EUR")) {
            output = input * cUSD / cEUR;
            System.out.printf("%.2f EUR", output);

        } else if (Curr1.equals("USD") & Curr2.equals("USD")) {
            output = input;
            System.out.printf("%.2f USD", output);

        } else if (Curr1.equals("USD") & Curr2.equals("GBP")) {
            output = input * cUSD / cGBP;
            System.out.printf("%.2f GBP", output);

        } else if (Curr1.equals("EUR") & Curr2.equals("BGN")) {
            output = input * cEUR / cBGN;
            System.out.printf("%.2f BGN", output);

        } else if (Curr1.equals("EUR") & Curr2.equals("USD")) {
            output = input * cEUR / cUSD;
            System.out.printf("%.2f USD", output);

        } else if (Curr1.equals("EUR") & Curr2.equals("EUR")) {
            output = input;
            System.out.printf("%.2f EUR", output);

        } else if (Curr1.equals("EUR") & Curr2.equals("GBP")) {
            output = input * cEUR / cGBP;
            System.out.printf("%.2f GBP", output);

        } else if (Curr1.equals("GBP") & Curr2.equals("BGN")) {
            output = input * cGBP / cBGN;
            System.out.printf("%.2f BGN", output);

        } else if (Curr1.equals("GBP") & Curr2.equals("USD")) {
            output = input * cGBP / cUSD;
            System.out.printf("%.2f USD", output);

        } else if (Curr1.equals("GBP") & Curr2.equals("EUR")) {
            output = input * cGBP / cEUR;
            System.out.printf("%.2f EUR", output);

        } else if (Curr1.equals("GBP") & Curr2.equals("GBP")) {
            output = input;
            System.out.printf("%.2f GBP", output);
        }


    }
}
