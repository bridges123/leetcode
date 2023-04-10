package easy.RemoveElement;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }

        return right;
    }

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 2, 1, 2, 3};
//        int[] array = new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 4, 3};
        int result = removeElement(array, 2);
        System.out.println(array.length);
        System.out.println(result);
        System.out.println(Arrays.toString(array));
        if (result == 3) {
            System.out.println("OK");
        }
    }
}
