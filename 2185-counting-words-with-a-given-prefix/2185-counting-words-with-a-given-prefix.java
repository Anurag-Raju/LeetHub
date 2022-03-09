class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int m=pref.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(words[i].length()<m){continue;}
            String s=words[i].substring(0,m);
            if(s.equals(pref)){
                count++;
            }
        }
        return count;
    }
}