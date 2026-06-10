import java.util.Scanner;

class Reverse_Integer {
    public int reverse(int x) {
        int c = 0;
        if(x<0)
        {
            x = Math.abs(x);
            c++;
        }
        int sum = 0;
        while(x>0)
        {
            int d = x%10;
            if(sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && d > 7))
            {
                return 0;
            }
            sum = sum*10+d;
            x=x/10;
        }
        if(c>0)
        {
            return -sum;
        }
        else
        {
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = sc.nextInt();
        Reverse_Integer sol = new Reverse_Integer();
        int res = sol.reverse(num);
        System.out.println(res);
        sc.close();
    }
}
