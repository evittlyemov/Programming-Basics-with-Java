import java.util.Scanner;

public class p16_NumberToText_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String ones[] = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String tens[] = {" ", " ", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (num == 100) {
            System.out.println("one hundred");
        } else if (num == 0) {
            System.out.println("zero");
        } else if (num > 19 && num < 100 && num != 20 && num != 30 && num != 40 && num != 50 && num != 60 && num != 70 && num != 80 && num != 90) {
            System.out.println(tens[num / 10] + " " + ones[num % 10]);
        } else if (num == 20 | num == 30 | num == 40 | num == 50 | num == 60 | num == 70 | num == 80 | num == 90) {
            System.out.println(tens[num / 10]);
        } else if (num <= 19 && num > 0) {
            System.out.println(ones[num % 100]);
        } else if (num > 100) {
            System.out.println("Invalid number");
        } else if (num < 0) {
            System.out.println("Invalid number");
        }

    }
}
