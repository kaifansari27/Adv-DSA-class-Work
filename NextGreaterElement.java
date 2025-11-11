// Finding Next Greater Element in Arrays 

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1];
        
         
        for(int i = 0; i < n1; i++){
            int next = -1;
            boolean found = false; // martlab initially element mil gya h ya nhi 
            for(int j = 0; j < n2; j++){
                if(nums2[j] == nums1[i]){
                    found = true; // start checking next greater after this
                }
                else if(found && nums2[j] > nums1[i]){
                    next = nums2[j];
                    break;
                }
            }
            res[i] = next;
        }
        return res;
    }
}
