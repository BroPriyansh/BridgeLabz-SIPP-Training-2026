import java.util.Scanner;
public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int formula = num * (num + 1) / 2;
        int sum = 0;

        for(int i = 1; i <= num; i++)
            sum += i;

        System.out.println("Formula = " + formula);
        System.out.println("For Sum = " + sum);
    }
}