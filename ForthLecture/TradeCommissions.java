import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        double commissionPercentage = -1;

        if (city.equals("sofia")) {
            if (sales >= 0 && sales <= 500)
                commissionPercentage = 0.05;
            else if (sales > 500 && sales <= 1000)
                commissionPercentage = 0.07;
            else if (sales > 1000 && sales <= 10000)
                commissionPercentage = 0.08;
            else if (sales > 10000)
                commissionPercentage = 0.12;
            else if (sales < 0)
                System.out.println("error");

        } else if (city.equals("varna")) {
            if (sales >= 0 && sales <= 500)
                commissionPercentage = 0.045;
            else if (sales > 500 && sales <= 1000)
                commissionPercentage = 0.075;
            else if (sales > 1000 && sales <= 10000)
                commissionPercentage = 0.10;
            else if (sales > 10000)
                commissionPercentage = 0.13;
            else if (sales < 0)
                System.out.println("error");

        } else if (city.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500)
                commissionPercentage = 0.055;
            else if (sales > 500 && sales <= 1000)
                commissionPercentage = 0.08;
            else if (sales > 1000 && sales <= 10000)
                commissionPercentage = 0.12;
            else if (sales > 10000)
                commissionPercentage = 0.145;
            else if (sales < 0)
                System.out.println("error");

        } else {
            System.out.println("error");
        }
        if (commissionPercentage >= 0) {
            double commission = commissionPercentage * sales;
            System.out.printf("%.2f", commission);
        }
    }
}
