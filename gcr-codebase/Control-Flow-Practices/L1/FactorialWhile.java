import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long fact = 1;
        while(num > 0) {
            fact *= num;
            num--;
        }

        System.out.println(fact);
    }
}