import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        String youngest = "Amar";
        int minAge = amarAge;

        if(akbarAge < minAge){ minAge = akbarAge; youngest = "Akbar"; }
        if(anthonyAge < minAge){ youngest = "Anthony"; }

        String tallest = "Amar";
        double maxHeight = amarHeight;

        if(akbarHeight > maxHeight){ maxHeight = akbarHeight; tallest = "Akbar"; }
        if(anthonyHeight > maxHeight){ tallest = "Anthony"; }

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
    }
}