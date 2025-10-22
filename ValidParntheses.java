public class ValidParentheses {
    public static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                
                return s.isEmpty();
            }
        }
    }
}


//  this is Second method Using Stack..


/*public class Solution {
    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.size() == 0) return false;

                char top = st.peek();

                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
*/
