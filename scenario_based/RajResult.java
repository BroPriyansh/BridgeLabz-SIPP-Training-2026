import java.util.Scanner;

public class RajResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            total += sc.nextInt();
        }

        double average = total / 5.0;
        char grade;

        switch ((int) average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}