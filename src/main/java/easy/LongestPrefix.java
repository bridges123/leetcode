package easy;

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {
        /*
        Good solution.
        String minPrefix = strs[0];

        for (int k = 1; k < strs.length; k++) {
            StringBuilder prefix = new StringBuilder();
            for (int i = 0; i < Math.min(strs[k].length(), strs[k-1].length()); i++) {
                if (strs[k].charAt(i) != strs[k-1].charAt(i)) {
                    break;
                } else {
                    prefix.append(strs[k].charAt(i));
                }
            }
            if (prefix.length() < minPrefix.length()) minPrefix = prefix.toString();
        }
        return minPrefix;

        Binary |
               v
         */
//        String prefix = "";

        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = minLen(strs);

        int low = 1;
        int high = minLen;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (commonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private static boolean commonPrefix(String[] strs, int length) {
        String sub = strs[0].substring(0, length);
        for (String str : strs) {
            if (!str.startsWith(sub)) {
                return false;
            }
        }
        return true;
    }

    private static int minLen(String[] strs) {
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }
        return min;
    }

    public static void main(String[] args) {
        String result = longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        if (result.equals("")) {
            System.out.println("OK");
        }
    }
}
