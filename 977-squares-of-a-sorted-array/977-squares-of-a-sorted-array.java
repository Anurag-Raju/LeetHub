class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        int result[]=new int[n];
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[r])>Math.abs(nums[l])){
                result[i]=nums[r]*nums[r];
                r--;
            }else{
                result[i]=nums[l]*nums[l];
                l++;
            }
        }
        return result;
    }
}