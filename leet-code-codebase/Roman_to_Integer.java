import java.util.Scanner;
import java.util.HashMap;

class Roman_to_Integer {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));
            
            // If current value is less than next value, subtract it (IV, IX, XL, XC, CD, CM)
            if (i + 1 < s.length() && currentValue < romanMap.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine();
        
        Roman_to_Integer solution = new Roman_to_Integer();
        int result = solution.romanToInt(roman);
        
        System.out.println("Integer value: " + result);
        sc.close();
    }
}
