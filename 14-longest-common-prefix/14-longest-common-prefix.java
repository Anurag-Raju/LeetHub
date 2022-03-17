class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        while(i<strs[0].length()){
            char ch=strs[0].charAt(i);
            if(strs[strs.length-1].charAt(i)!=ch){
                break;
            }
            i++;
        }
        return strs[0].substring(0,i);
    }
}