package easy.RomanInt;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RomanInt {

    public static int romanToInt(String s) {
        char[] str = s.toCharArray();
        int num = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            int a = switch (str[i]) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if (4 * a < num) {
                num -= a;
            }  else {
                num += a;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int result = romanToInt("LXIX");
        if (result == 69) {
            System.out.println("OK");
        }
    }
}
