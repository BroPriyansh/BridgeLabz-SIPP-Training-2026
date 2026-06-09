import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxl = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxl = Math.max(maxl, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxl;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        Longest_Substring_Without_Repeating_Characters sol = new Longest_Substring_Without_Repeating_Characters();
        int result = sol.lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + result);
        sc.close();
    }
}
