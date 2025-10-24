// User function Template for Java

class PostfixtoInfix {
    
    static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    
    static String postToInfix(String post_exp) {
        java.util.Stack<String> st = new java.util.Stack<>();
        
        // Traverse left to right
        for(int i = 0; i < post_exp.length(); i++){
            char ch = post_exp.charAt(i);
            
            // If operand -> push
            if(Character.isLetterOrDigit(ch)){
                st.push(ch + "");
            }
            // If operator
            else if(isOperator(ch)){
                String op2 = st.pop();
                String op1 = st.pop();
                String exp = "(" + op1 + ch + op2 + ")";
                st.push(exp);
            }
        }
        return st.peek();
    }
}
