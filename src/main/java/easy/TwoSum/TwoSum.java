package easy.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        if (result[0] == 0 && result[1] == 1) {
            System.out.println("OK");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        /*
        // Slow version

        int len = nums.length;
        int [] result = new int[2];
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
         */

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (map.containsKey(c)) {
                return new int[] { map.get(c), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
