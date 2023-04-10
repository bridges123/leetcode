package easy.RemoveDuplicatesSortArray;

import java.util.Arrays;

public class RemoveDuplicatesSortArray {
    public static int removeDuplicates(int[] nums) {
        /*
        Nice solution, but necessary info

        int cnt = 1;
        int dupCounter = 0;
        int trackNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == trackNum) {
                dupCounter++;
            } else {
                if (dupCounter > 0) {
                    int temp = nums[i];
                    nums[i] = nums[i - dupCounter + 1];
                    nums[i - dupCounter + 1] = temp;

                    trackNum = temp; // curr num
                }
                cnt++;
            }
        }

        return cnt;
        */

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4};
//        int[] array = new int[]{1, 2, 3, 3, 3, 4};
        int result = removeDuplicates(array);
        System.out.println(result);
        System.out.println(Arrays.toString(array));
        if (result == 2) {
            System.out.println("OK");
        }
    }
}
