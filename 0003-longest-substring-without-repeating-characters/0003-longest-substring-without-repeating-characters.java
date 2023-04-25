class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLength = 0;
        Set<Character> hs = new HashSet<Character>();
            
        for(right =0;right<s.length();right++){
            if(!hs.contains(s.charAt(right)))
               {
                   hs.add(s.charAt(right));
                   maxLength = Math.max(maxLength,right-left+1);
               }
            else{
                while(s.charAt(right) != s.charAt(left)){
                    hs.remove(s.charAt(left));
                    left++;
                }
                hs.remove(s.charAt(left));
                left++;
                hs.add(s.charAt(right));
            } 
              
        }
        
        return maxLength;
            
        }
        
    }