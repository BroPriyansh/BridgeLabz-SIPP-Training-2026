import java.util.Scanner;

public class Metro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter card balance: ");
        double balance = sc.nextDouble();

        while (balance > 0) {
            System.out.print("Enter distance (km): ");
            int distance = sc.nextInt();

            double fare = distance <= 5 ? 10 :
                          distance <= 10 ? 20 :
                          distance <= 20 ? 30 : 40;

            if (balance < fare) {
                System.out.println("Insufficient balance");
                break;
            }

            balance -= fare;

            System.out.println("Fare: " + fare);
            System.out.println("Remaining Balance: " + balance);

            System.out.print("Continue? (y/n): ");
            char ch = sc.next().charAt(0);

            if (ch == 'n' || ch == 'N') {
                break;
            }
        }

        System.out.println("Session Ended");
    }
}