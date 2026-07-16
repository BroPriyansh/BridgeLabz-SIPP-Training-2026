import java.util.Scanner;
public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int formula = num * (num + 1) / 2;
        int sum = 0, i = 1;

        while(i <= num) {
            sum += i;
            i++;
        }

        System.out.println("Formula = " + formula);
        System.out.println("While Sum = " + sum);
    }
}