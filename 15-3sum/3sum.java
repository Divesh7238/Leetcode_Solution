class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            
            int target = -nums[i];

            while (j < k) {
                int currentSum = nums[j] + nums[k];
                
                if (currentSum == target) {
                    
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    j++;
                    k--;
                    
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                    
                } 
                else if (currentSum > target) {
                    k--;
                } 
                else {
                    j++;
                }
            }
        }
        
        return new ArrayList<>(res);
    }
}