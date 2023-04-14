package easy.SqrtX;

public class SqrtX {
    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int result = mySqrt(375);
        System.out.println(result);
        if (result == 19) {
            System.out.println("OK");
        }
    }
}
