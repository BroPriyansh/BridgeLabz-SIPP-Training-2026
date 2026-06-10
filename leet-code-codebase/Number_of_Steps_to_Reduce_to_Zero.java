import java.util.Scanner;

class Number_of_Steps_to_Reduce_to_Zero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if ((num & 1) == 0) num /= 2;
            else num -= 1;
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Number_of_Steps_to_Reduce_to_Zero sol = new Number_of_Steps_to_Reduce_to_Zero();
        int res = sol.numberOfSteps(n);
        System.out.println(res);
        sc.close();
    }
}
