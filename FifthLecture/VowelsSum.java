import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < word.length() ; i++) {
           int b = (word.charAt(i));

            switch (b) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum+= 4;
                    break;
                case 'u':
                    sum+= 5;
                    break;

            }


        }
        System.out.println(sum);
    }
}
