package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
//Two Sum
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

/**
 * @author Steven
 */


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        if (null == nums || nums.length < 2) {
            return new int[]{-1, -1};
        }

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums,target);
        System.out.println("the result is : " + result[0] + " and " + result[1]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
