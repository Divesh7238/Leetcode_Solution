class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i  =0; i<32; i++){
            int LSB = n & 1;
            int revLSB = LSB << (31 - i);
            res = res | revLSB;
            n = n >> 1;
        }
        return res;
        
    }
}