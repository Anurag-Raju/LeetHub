class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int ans[]=new int[prices.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }else{
                ans[i]=prices[i]-st.peek();
            }
            if(st.isEmpty()){
                st.push(prices[i]);
            }
        }
        for(int i=0;i<ans.length;i++){
            max=Math.max(max,ans[i]);
        }
        return max;
    }
}