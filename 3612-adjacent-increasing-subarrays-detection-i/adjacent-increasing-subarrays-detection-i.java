import java.util.*;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for (int i = 0; i <= nums.size() - 2 * k; i++) {
            if (check(nums, i, i + k - 1) && check(nums, i + k, i + 2 * k - 1)) {
                return true;
            }
        }
        return false;
    }

    boolean check(List<Integer> nums, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            if (nums.get(i) <= nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
