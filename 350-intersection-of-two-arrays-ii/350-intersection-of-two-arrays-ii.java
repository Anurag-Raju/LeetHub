class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums1)
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        for(int i:nums2){
            if(hmap.containsKey(i) && hmap.get(i)!=0){
                list.add(i);
                hmap.put(i,hmap.get(i)-1);
            }
        }
        int arr[]=new int[list.size()];
        int j=0;
        for(int i:list)
            arr[j++]=i;
        return arr;
    }
}

/*class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums1)
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        for(int i:nums2){
            if(hmap.getOrDefault(i,0)!=0){
                list.add(i);
                hmap.put(i,hmap.getOrDefault(i,0)-1);
            }
        }
        int arr[]=new int[list.size()];
        int j=0;
        for(int i:list)
            arr[j++]=i;
        return arr;
    }
}*/