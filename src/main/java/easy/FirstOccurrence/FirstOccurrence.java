package easy.FirstOccurrence;

public class FirstOccurrence {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (n < m) return -1;

        int needleIndex = 0;

        for (int i = 0; i < n; i++) {
            if (haystack.charAt(i) == needle.charAt(needleIndex)) {
                needleIndex++;
                if (needleIndex == needle.length()) {
                    return i - needleIndex + 1;
                }
            } else {
                if (needleIndex > 0) {
                    i -= needleIndex;
                }
                needleIndex = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = strStr("mississippi", "pi");
        System.out.println(result);
        if (result == 0) {
            System.out.println("OK");
        }
    }
}
