class Solution {
    public int[] findErrorNums(int[] arr) {
           int  i = 0;
        while ( i < arr.length ) {
            int correctidx = arr[i] -1;
            if(arr[i] != arr[correctidx] ){
              swap(arr, i , correctidx);
            }else{
                i++;
            }
        }

        for(int idx =0; idx<arr.length; idx++){
            if(arr[idx] != idx + 1){
                return new int[] {arr[idx], idx+1};
            }
        }
        return new int[] {};
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
        
    
}