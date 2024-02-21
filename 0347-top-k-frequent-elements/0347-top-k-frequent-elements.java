class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    
        for(int ele : nums){
            frequencyMap.put(ele,frequencyMap.getOrDefault(ele,0)+1);
        }
        // System.out.print(frequencyMap);
        
        for(int key : frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        
        int[] res = new int[k];
        int counter = 0;
        
        for(int pos=bucket.length-1;pos >= 0 && counter < k;pos--){
            if(bucket[pos] != null){
                for(Integer integer : bucket[pos]){
                    res[counter++] = integer;
                }
            }
        }
        
        return res;
    }
}