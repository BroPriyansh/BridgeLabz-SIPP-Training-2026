import java.util.Scanner;

class Palindrome_Number {
    public boolean isPalindrome(int x) {
        int sum = 0;
        if(x<0)
        {
            return false;
        }
        else
        {
            int x1 = x;
            while(x1!=0)
            {
                int d = x1%10;
                sum = sum*10 + d;
                x1 = x1/10;
            }
            if(x==sum)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Palindrome_Number solution = new Palindrome_Number();
        boolean result = solution.isPalindrome(num);
        System.out.println(result);
        sc.close();
    }
}