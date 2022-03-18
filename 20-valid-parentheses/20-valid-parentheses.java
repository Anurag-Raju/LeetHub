class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        if(n%2==1)
            return false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    switch(ch){
                        case ')':
                            if(st.peek()=='[' || st.peek()=='{')
                                return false;
                            else
                                st.pop();
                            break;
                            case '}':
                            if(st.peek()=='[' || st.peek()=='(')
                                return false;
                            else
                                st.pop();
                            break;
                            case ']':
                            if(st.peek()=='(' || st.peek()=='{')
                                return false;
                            else
                                st.pop();
                            break;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}