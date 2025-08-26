import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Bruit Force Approach
        List<Integer> merged = new ArrayList<>();
        for (int num : nums1) merged.add(num);
        for (int num : nums2) merged.add(num);
        
        Collections.sort(merged);
        
        int n = merged.size();
        if (n % 2 == 1) {
            return merged.get(n / 2);
        } else {
            return (merged.get(n / 2 - 1) + merged.get(n / 2)) / 2.0;
        }
    }
}
