// User function Template for Java

class PrefixtoPostfix {
    
    static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    
    static String preToPost(String pre_exp) {
        java.util.Stack<String> st = new java.util.Stack<>();
        
        // Traverse from right to left
        for(int i = pre_exp.length()-1; i >= 0; i--){
            char ch = pre_exp.charAt(i);
            
            // If operand, push to stack
            if(Character.isLetterOrDigit(ch)){
                st.push(ch + "");
            }
            // If operator
            else if(isOperator(ch)){
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = op1 + op2 + ch; // postfix = operand1 operand2 operator
                st.push(exp);
            }
        }
        return st.peek();
    }
}
