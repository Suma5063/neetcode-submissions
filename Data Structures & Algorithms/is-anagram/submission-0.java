class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count1 = countFrequency(s);
        int[] count2 = countFrequency(t);
        for(int i=0; i<26; i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }

    static int[] countFrequency(String s){
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
               count[ch-65]++;
            }
            else if(ch>='a'&& ch<='z'){
               count[ch-97]++;
            }
           
        }
         return count;
    }
}
