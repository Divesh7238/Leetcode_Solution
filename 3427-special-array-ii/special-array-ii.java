class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] count = new int[n];
        count[0] = 0;

        for(int i =1; i<n; i++){
            int parity = (nums[i] % 2 == nums[i-1] % 2) ? 1 : 0;
            count[i] = parity+count[i-1];
        }

        int q = queries.length;
        boolean[] answer = new boolean[q];
        for(int i=0;i<q; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            answer[i] =  ((count[end] - count[start])==0);
        }
        return answer;
    }
}