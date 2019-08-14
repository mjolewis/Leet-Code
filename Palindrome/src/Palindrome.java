/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class Palindrome {
    public boolean isPalindrome(int x) {

        if (x < 0) { // Edge case. -121 is not a palindrome because both sides of the number dont have the "-" sign
            return false;
        }
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (x == reversed) ? true : false;
    }

    public static void main(String[] args) {
        Palindrome palindrome1 = new Palindrome();
        Palindrome palindrome2 = new Palindrome();
        Palindrome palindrome3 = new Palindrome();
        Palindrome palindrome4 = new Palindrome();
        System.out.println(palindrome1.isPalindrome(121));
        System.out.println(palindrome2.isPalindrome(56932));
        System.out.println(palindrome3.isPalindrome(1001001));
        System.out.println(palindrome4.isPalindrome(-121));
    }
}
