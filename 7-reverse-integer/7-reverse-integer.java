class Solution {
    public int reverse(int x) {
        int temp=0,rev=0;
        while(x!=0){
            temp=x%10;
            x/=10;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && temp>7) return 0;
            if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10 && temp<-8) return 0;
            rev=(rev*10)+temp;
        }
        return rev;
    }
}