class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> hmap=new HashMap<>();
        for(String str:strs){
            HashMap<Character,Integer> fmap=new HashMap<>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
            }
            if(!hmap.containsKey(fmap)){
                ArrayList<String> list=new ArrayList<>();
                list.add(str);
                hmap.put(fmap,list);
            }else{
                ArrayList<String> list=hmap.get(fmap);
                list.add(str);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(ArrayList<String> res:hmap.values()){
            ans.add(res);
        }
        return ans;
    }
}