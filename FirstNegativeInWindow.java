// Finding 1st negative Integer in every window of size k

import java.util.*;

class FirstNegativeInWindow {
    public static long[] firstNegativeInWindow(int[] arr, int k) {
        int n = arr.length;
        long[] res = new long[n - k + 1];
        Queue<Integer> q = new LinkedList<>();
        int idx = 0;

        for(int i = 0; i < n; i++){
            // Remove indices out of window
            while(!q.isEmpty() && q.peek() < i - k + 1){
                q.poll();
            }

            // If current element is negative, add index
            if(arr[i] < 0){
                q.offer(i);
            }

            // Window is ready
            if(i >= k - 1){
                if(q.isEmpty()){
                    res[idx++] = 0;
                } else {
                    res[idx++] = arr[q.peek()];
                }
            }
        }
        return res;
    }

     
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        long[] ans = firstNegativeInWindow(arr, k);
        System.out.println(Arrays.toString(ans));
        // Output: [-1, -1, -7, -15, -15, 0]
    }
}
