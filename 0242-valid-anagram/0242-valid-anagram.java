class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        s= s.toLowerCase();
        t= t.toLowerCase();
        if(s.length() != t.length())
            return false;
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 97]++;
            arr[t.charAt(i) - 97]--;
        }
        
        for(int i=0;i<26;i++)
        {
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
}