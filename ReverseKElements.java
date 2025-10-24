import java.util.*;

class ReverseKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        
        // Step 1: Push first K elements into stack
        for(int i = 0; i < k; i++){
            if(!q.isEmpty())
                stack.push(q.poll());
        }
        
        // Step 2: Enqueue back the stack elements (reversed)
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
        
        // Step 3: Move the remaining elements to the back
        int size = q.size();
        for(int i = 0; i < size - k; i++){
            q.offer(q.poll());
        }
        
        return q;
    }

    // Main method to test
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int num : arr){
            q.offer(num);
        }

        int k = 3;
        Queue<Integer> ans = reverseKElements(q, k);

        System.out.println(ans); // Output: [3, 2, 1, 4, 5, 6, 7, 8]
    }
}
