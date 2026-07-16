import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0)
            System.out.println(num * (num + 1) / 2);
        else
            System.out.println("Not a Natural Number");
    }
}