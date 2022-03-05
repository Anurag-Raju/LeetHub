class Solution {
    public int mostFrequent(int[] nums, int key) {
        int l=0,k=0;
        //nums=[1,100,1,100,1] key=1
       //create a temporary array to store all the elements which follow the key[0,0,0,0,0]
        int[] arr=new int[nums.length];
        while(l<nums.length-1){
            if(nums[l]==key){
                arr[k]=nums[l+1];
                k++;
            }
            l++;
        }
        //arr=[100,100,0,0,0]
       //store the frequency of the elements in the stored temporary array in a hashmap
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int j=0;j<arr.length;j++){
            hmap.put(arr[j],hmap.getOrDefault(arr[j],0)+1);
        }
        //check for which element the frequency is maximum
        //we should not consider the 0 or empty elements in the temporary array {100->2, 0->3} because array is not dynamic so 0's represent the empty elements
        int ans=0,res=0;
        for(int elem:hmap.keySet()){
            if(hmap.get(elem)>ans && elem!=0){
                res=elem;
                ans=hmap.get(elem);
            }
        }
        return res;
    }
}