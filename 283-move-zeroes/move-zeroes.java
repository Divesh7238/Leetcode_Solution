class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int newIndex= 0;
        for(int i =0; i<n; i++){
            if(nums[i] != 0){
                nums[newIndex] = nums[i];
                newIndex++;

            }
        }
        while(newIndex < n){
            nums[newIndex] = 0;
            newIndex++;
        }
    }
}