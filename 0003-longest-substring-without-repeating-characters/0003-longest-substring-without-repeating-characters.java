class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLength = 0;
        Set<Character> hs = new HashSet<Character>();
            
        for(right =0;right<s.length();right++){
            while(!hs.add(s.charAt(right))){
                hs.remove(s.charAt(left++));
            }
            maxLength = Math.max(maxLength, hs.size());
              
        }
        
        return maxLength;
            
        }
        
    }