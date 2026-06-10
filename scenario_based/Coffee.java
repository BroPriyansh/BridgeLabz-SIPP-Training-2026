import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalPrice = 0.0;
        boolean ordering = true;

        while (ordering) {
            System.out.println("Choose a coffee type:");
            System.out.println("1. Espresso ($2.50)");
            System.out.println("2. Latte ($3.50)");
            System.out.println("3. Cappuccino ($4.00)");
            System.out.println("4. Exit and calculate total");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            double unitPrice;

            switch (choice) {
                case 1:
                    unitPrice = 2.50;
                    break;
                case 2:
                    unitPrice = 3.50;
                    break;
                case 3:
                    unitPrice = 4.00;
                    break;
                case 4:
                    ordering = false;
                    continue;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
                    continue;
            }

            System.out.print("Enter the quantity of coffee: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            if (quantity <= 0) {
                System.out.println("Invalid quantity. Quantity must be greater than zero.");
                continue;
            }

            totalPrice += unitPrice * quantity;
            System.out.printf("Added %d cup(s) at $%.2f each. Current subtotal: $%.2f%n", quantity, unitPrice, totalPrice);
            System.out.println();
        }

        if (totalPrice == 0.0) {
            System.out.println("No coffee was ordered.");
        } else {
            totalPrice *= 1.07;
            System.out.printf("The final price after 7%% tax is: $%.2f%n", totalPrice);
        }

        sc.close();
    }
}