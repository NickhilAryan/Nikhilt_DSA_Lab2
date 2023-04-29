import java.util.*;

public class CurrencyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations:");
        int size = scanner.nextInt();
        int[] denominations = new int[size];
        System.out.println("Enter the currency denominations value:");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }
        System.out.println("Enter the amount you want to pay:");
        int amount = scanner.nextInt();

        // Sort the denominations in descending order
        Arrays.sort(denominations);
        int[] count = new int[size];

        // Calculate the minimum number of notes required
        for (int i = size - 1; i >= 0; i--) {
            if (amount >= denominations[i]) {
                count[i] = amount / denominations[i];
                amount %= denominations[i];
            }
        }

        // Print the payment approach
        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (int i = size - 1; i >= 0; i--) {
            if (count[i] > 0) {
                System.out.println(denominations[i] + ":" + count[i]);
            }
        }
    }
}
