package easy.LengthLastWord;

public class LengthLastWord {
    public static boolean isLetter(char c) {
        return 'A' <= c && c <= 'Z' || 'a' <= c && c <= 'z';
    }

    public static int lengthOfLastWord(String s) {
        boolean startLetter = false;
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (isLetter(s.charAt(i))) {
                startLetter = true;
            }
            if (startLetter) {
                if (s.charAt(i) != ' ') {
                    len++;
                } else {
                    break;
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int result = lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(result);
        if (result == 4) {
            System.out.println("OK");
        }
    }
}
