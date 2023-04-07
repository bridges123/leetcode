package easy;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static void main(String[] args) {
        boolean result = isPalindrome(1221);
        if (result == true) {
            System.out.println("OK");
        }
    }

    public static int len(int x) {
        int i = 0;
        while (x > 0) {
            x /= 10;
            i++;
        }
        return i;
    }

    public static boolean isPalindrome(int x) {
        /*
        Good soultion, but slower

        int len = len(x);
        int i = 0;
        while (i < len / 2 + (len % 2)) {
            int l = (x % ((int)Math.pow(10, i+1))) / (int)Math.pow(10, i);
            int p = x / (int)Math.pow(10,len - i - 1) % 10;
            if (p != l) return false;
            i++;
        }
        return true;
         */
        // 1221
        // 1221
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        }

        return x == reverse || x == reverse / 10;
    }
}
