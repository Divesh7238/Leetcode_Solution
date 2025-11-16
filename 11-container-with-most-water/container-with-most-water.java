class Solution {
    public int maxArea(int[] height) {
        int l =0;
        int r = height.length -1;
        int max = 0;
        while(l < r){
            int  LH = height[l];
            int  RH = height[r];
            int min_H = Math.min(LH , RH);
            max = Math.max(max , min_H * (r-l));
            if( LH < RH){
                l++;

            }else{
                r--;
            }
        }
        return max;
    }
}