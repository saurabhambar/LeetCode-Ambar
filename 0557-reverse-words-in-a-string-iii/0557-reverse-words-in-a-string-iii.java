class Solution {
    public String reverseWords(String s) {
        String res = "";
        String[] str = s.split(" ");
        int n = str.length;
        
        for(int i=0;i< n;i++){
            if(i > 0)
                res += " ";
            String ans = reverse(str[i]);
            res += ans;
        }
        return res;
    }
    
    public static String reverse(String str){
        char[] ch = str.toCharArray();
        int i=0, j= ch.length - 1;
        
        while(i<=j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j]= temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}