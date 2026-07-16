import java.util.Scanner;

public class TaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();
        double tax;
        String bracket;

        if (income < 10000) {
            bracket = "5%";
            tax = income * 0.05;
        } else if (income <= 50000) {
            bracket = "15%";
            tax = income * 0.15;
        } else {
            bracket = "30%";
            tax = income * 0.30;
        }

        System.out.println("Tax Bracket: " + bracket);
        System.out.println("Tax Amount: " + tax);

        double[] incomes = {8000, 12000, 25000, 40000, 55000, 7000, 90000, 30000, 15000, 60000};
        double totalTax = 0;

        for (double inc : incomes) {
            if (inc < 10000) {
                totalTax += inc * 0.05;
            } else if (inc <= 50000) {
                totalTax += inc * 0.15;
            } else {
                totalTax += inc * 0.30;
            }
        }

        System.out.println("Total Tax Collected: " + totalTax);

        sc.close();
    }
}