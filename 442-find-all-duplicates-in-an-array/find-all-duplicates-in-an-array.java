class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         int  i = 0;
        while ( i < nums.length ) {
            int correctidx = nums[i] -1;
            if(nums[i] != nums[correctidx] ){
              swap(nums, i , correctidx);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int idx =0; idx< nums.length;idx++){
            if(nums[idx] != idx +1){
                ans.add(nums[idx]);
            }
        }
        return ans;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
        
}