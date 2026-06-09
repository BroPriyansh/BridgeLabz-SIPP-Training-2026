import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeap = year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

        if (isLeap)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}