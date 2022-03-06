class Solution {
    public long minimalKSum(int[] nums, int k) {
         long sum=(long)k*(k+1)/2;
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(num<=k && !set.contains(num)){
                sum=sum-num;
                count++;
            }
            set.add(num);
        }
        int i=k+1;
        while(count>0){
            if(!set.contains(i)){
                sum+=i;
                count--;
            }
            i++;
        }
        return sum;
    }
}