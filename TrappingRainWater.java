// Rain Trapping Water or you can you say Finding Maximun area.....

class TrappingRainWater {
    public int trap(int[] height) {
        
        int n = height.length;
        if( n == 0 ) return 0 ;
        // creating leftMax array 
        int [] leftMax = new int [n];
        // creating rigthMax array
        int [] rightMax = new int [n];
        int water = 0 ;


        //fill leftMax
        //Matlab i position ka leftMax uske turant pichle (i-1) ke max value par depend karega.


        leftMax[0] = height [0];
        for(int i = 1 ; i < n ; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }


        // fill rightMax
        //Matlab i position ka rightMax uske turant agle (i+1) ke max value par depend karega.


        rightMax[n-1] = height[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        //Calculate Water
        for(int i = 0 ; i < n ; i++){
            water += Math.min(leftMax[i], rightMax[i]) - height[i] ;
        }
        return water ;
    }
}










