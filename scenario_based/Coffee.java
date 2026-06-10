import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the type of coffee (Espresso, Latte, Cappuccino): ");
        String coffeeType = sc.nextLine().trim();

        System.out.print("Enter the quantity of coffee: ");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Invalid quantity. Quantity must be greater than zero.");
            sc.close();
            return;
        }

        double unitPrice;
        switch (coffeeType.toLowerCase()) {
            case "espresso":
                unitPrice = 2.50;
                break;
            case "latte":
                unitPrice = 3.50;
                break;
            case "cappuccino":
                unitPrice = 4.00;
                break;
            default:
                System.out.println("Invalid coffee type.");
                sc.close();
                return;
        }

        double price = (unitPrice) * quantity;
        price *= 1.07;

        System.out.printf("The price of your %s is: $%.2f%n", coffeeType, price);
        sc.close();
    }
}