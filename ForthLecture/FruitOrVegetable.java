import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        boolean isItFruit = product.equals("banana") || product.equals("apple") || product.equals("kiwi") || product.equals("cherry") ||
                product.equals("lemon") || product.equals("grapes");
        boolean isItVegetable = product.equals("tomato") || product.equals("cucumber") || product.equals("pepper") ||
                product.equals("carrot");
        if (isItFruit) {
            System.out.println("fruit");
        } else if (isItVegetable) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
