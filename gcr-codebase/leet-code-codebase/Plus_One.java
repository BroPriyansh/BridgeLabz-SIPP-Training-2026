import java.util.*;

class Plus_One {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) 
        {
            if (digits[i] < 9) 
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;                                       
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits separated by space (e.g. 1 2 3) or a continuous number (e.g. 123):");
        String line = sc.nextLine().trim();
        int[] digits;
        if (line.contains(" ")) {
            String[] parts = line.split("\\s+");
            digits = new int[parts.length];
            for (int i = 0; i < parts.length; i++) digits[i] = Integer.parseInt(parts[i]);
        } else {
            digits = new int[line.length()];
            for (int i = 0; i < line.length(); i++) digits[i] = line.charAt(i) - '0';
        }
        Plus_One sol = new Plus_One();
        int[] res = sol.plusOne(digits);
        for (int i = 0; i < res.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(res[i]);
        }
        System.out.println();
        sc.close();
    }
}
