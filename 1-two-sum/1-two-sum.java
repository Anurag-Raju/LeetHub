class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap <Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            if(hmap.containsKey(target-nums[i])){
                arr[0]=i;
                arr[1]=hmap.get(target-nums[i]);
            }
            hmap.put(nums[i],i);
        }
        return arr;
    }
}