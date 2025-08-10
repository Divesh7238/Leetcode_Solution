class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            // reverse Array
            int i = 0;
            int j = row.length -1;
            while(i <= j){
                int temp = row[i]^1;
                row[i] = row[j]^1;
                row[j] = temp;
                i++;
                j--;
            }
            // for(int k=0; k<row.length;k++){
            //     row[k] = row[k] ^ 1;

            // }


        }
        return image;

        
    }
}