class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int  i = 0;
        while ( i < arr.length ) {
            int correctidx = arr[i] -1;
            if(arr[i] != arr[correctidx] ){
              swap(arr, i , correctidx);
            }else{
                i++;
            }
        }

        List<Integer> ans  = new ArrayList<>();
        for(int index =0; index < arr.length; index++){
            if(arr[index] != index + 1){
                ans.add(index+1);
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