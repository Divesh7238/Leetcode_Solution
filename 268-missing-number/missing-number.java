class Solution {
    public int missingNumber(int[] arr) {
        int  i = 0;
        while ( i < arr.length ) {
            int correctidx = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctidx] ){
              swap(arr, i , correctidx);
            }else{
                i++;
            }
        }
         for(int j =0; j<arr.length; j++){
            if( arr[j] != j){
                return j;
            }
         }
         return arr.length;
    }
    

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}