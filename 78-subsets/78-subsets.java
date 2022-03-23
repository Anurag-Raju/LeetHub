class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> biglist=new ArrayList<>();
        biglist.add(new ArrayList<>());
        for(int x:nums){
            int n=biglist.size();
            for(int i=0;i<n;i++){
               List<Integer> list=new ArrayList<>(biglist.get(i));
                list.add(x);
                biglist.add(list);
            }
        }
        return biglist;
    }
}