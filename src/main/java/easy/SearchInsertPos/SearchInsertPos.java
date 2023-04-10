package easy.SearchInsertPos;

public class SearchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        /*
        O(N) algo |
                  v

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;

        O(logN) algo |
                     v
         */
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int result = searchInsert(new int[]{1, 3, 5, 6}, 5);
        System.out.println(result);
        if (result == 0) {
            System.out.println("OK");
        }
    }
}
