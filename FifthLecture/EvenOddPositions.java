import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EvenOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("#.####");

        int nNumbers = Integer.parseInt(scanner.nextLine());

        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenSum = 0.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        if (nNumbers == 0) {
            System.out.printf("OddSum =%s %n", df.format(oddSum));
            System.out.printf("OddMin =No %n");
            System.out.printf("OddMax =No %n");
            System.out.printf("EvenSum =%s %n", df.format(evenSum));
            System.out.printf("EvenMin =No %n");
            System.out.printf("EvenMax =No %n");
        } else if (nNumbers == 1) {
            double currentNumber = Double.parseDouble(scanner.nextLine());
            System.out.printf("OddSum =%s %n", df.format(currentNumber));
            System.out.printf("OddMin =%s %n", df.format(currentNumber));
            System.out.printf("OddMax =%s %n", df.format(currentNumber));
            System.out.printf("EvenSum =%s %n", df.format(evenSum));
            System.out.printf("EvenMin =No %n");
            System.out.printf("EvenMax =No %n");
        } else {
            for (int i = 1; i <= nNumbers; i++) {
                double currentNumber = Double.parseDouble(scanner.nextLine());

                if (i % 2 != 0) {
                    oddSum += currentNumber;
                    if (currentNumber < oddMin) {
                        oddMin = currentNumber;
                    }
                    if (currentNumber > oddMax) {
                        oddMax = currentNumber;
                    }

                }
                if (i % 2 == 0) {
                    evenSum += currentNumber;
                    if (currentNumber < evenMin) {
                        evenMin = currentNumber;
                    }
                    if (currentNumber > evenMax) {
                        evenMax = currentNumber;
                    }
                }

            }
            System.out.printf("OddSum =%s %n", df.format(oddSum));
            System.out.printf("OddMin =%s %n", df.format(oddMin));
            System.out.printf("OddMax =%s %n", df.format(oddMax));
            System.out.printf("EvenSum =%s %n", df.format(evenSum));
            System.out.printf("EvenMin =%s %n", df.format(evenMin));
            System.out.printf("EvenMax =%s %n", df.format(evenMax));

        }
    }
}
