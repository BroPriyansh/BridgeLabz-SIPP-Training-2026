import java.util.Scanner;
public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int counter = 100;

        while(counter >= 1) {
            if(counter % num == 0)
                System.out.println(counter);
            counter--;
        }
    }
}