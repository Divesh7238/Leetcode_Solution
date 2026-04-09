import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
            // Step 1: Frequency map
                    Map<Integer, Integer> map = new HashMap<>();
                            for (int num : arr) {
                                        map.put(num, map.getOrDefault(num, 0) + 1);
                                                }

                                                        // Step 2: Store frequencies
                                                                List<Integer> freqList = new ArrayList<>(map.values());
                                                                        
                                                                                // Step 3: Sort frequencies
                                                                                        Collections.sort(freqList);

                                                                                                // Step 4: Remove smallest frequencies first
                                                                                                        int unique = freqList.size();
                                                                                                                for (int freq : freqList) {
                                                                                                                            if (k >= freq) {
                                                                                                                                            k -= freq;
                                                                                                                                                            unique--;
                                                                                                                                                                        } else {
                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                            }

                                                                                                                                                                                                                    return unique;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        }