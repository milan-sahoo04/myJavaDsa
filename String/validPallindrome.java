import java.util.*;

public class validPallindrome {

    // Brute
    // public static boolean isPalindrome(String s) {
    // String str = s.replace(" ", " ").toLowerCase().replaceAll("[^a-zA-Z0-9]",
    // "");
    // if (str.equals(reverse(s))) {
    // return true;
    // } else if (s.equals(" "))
    // return true;
    // return false;
    // }

    // public static String reverse(String s) {
    // return new StringBuilder(s.replace(" ", "
    // ").toLowerCase().replaceAll("[^a-zA-Z0-9]", "")).reverse().toString();
    // }

    // Optimal
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if (!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                    return false;
                l++;
                r--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "race a car ";
        System.out.println(isPalindrome(str));
        sc.close();
    }
}
