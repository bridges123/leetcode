package easy.PlusOne;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        System.out.println(Arrays.toString(array));
        int[] result = plusOne(array);
        System.out.println(Arrays.toString(result));
    }
}
