class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        
        for(String ele : strs){
            char[] arr = ele.toCharArray();
            Arrays.sort(arr);
            String value = new String(arr);
            
            if(!mp.containsKey(value)){
                mp.put(value, new ArrayList<String>());
            }
            mp.get(value).add(ele);
        }
        res.addAll(mp.values());
        
        return res;
    }
}