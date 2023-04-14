package easy.AddBinary;

public class AddBinary {
    public static String addBinary(String a, String b) {
        /*
        Nice solution, but overloaded |
                                      v

        int l1 = a.length();
        int l2 = b.length();
        int minLen = Math.min(l1, l2);
        int maxLen = Math.max(l1, l2);
        StringBuilder result = new StringBuilder();
        int add = 0;

        for (int i = 1; i <= minLen; i++) {
            int c1 = a.charAt(l1 - i) - '0';
            int c2 = b.charAt(l2 - i) - '0';
            int res = c1 + c2 + add;
            add = res / 2;
            res = res % 2;
            result.append(res);
        }

        for (int i = minLen + 1; i <= maxLen; i++) {
            int c;
            if (l1 > l2) {
                c = a.charAt(l1 - i) - '0';
            } else {
                c = b.charAt(l2 - i) - '0';
            }
            int res = c + add;
            add = res / 2;
            res = res % 2;
            result.append(res);
        }

        if (add == 1) {
            result.append(1);
        }
        return result.reverse().toString();

        Compact solution |
                         v
        */

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int add = 0;

        while (i >= 0 || j >= 0 || add == 1) {
            if (i >= 0) {
                add += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                add += b.charAt(j--) - '0';
            }
            result.append(add % 2);
            add /= 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String result = addBinary("1010", "1011");
        System.out.println(result);
        if (result.equals("10101")) {
            System.out.println("OK");
        }
    }
}
