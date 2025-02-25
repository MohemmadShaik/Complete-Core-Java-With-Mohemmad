/* Trapped Rain water :
 
Given n non-negative integers representing an elevation map where the width
of each bar is 1, compute how much water it can trap after raining.

here elevation means height of the bar and given height = {4, 2, 0, 6, 3, 2, 5}

Note: The solution is to calculate the max left boundary and max right boundary
for each element in the array. 
trappedRainWater = min(max left boundary, max right boundary) - height
 */

public class Practice8_9_1_TrappingRainwater {
    public static int trapRainWater(int height[]){
		int n = height.length;
		
		//calculate max left boundary - array
		int maxLeftBound[] = new int[n];
		    maxLeftBound[0] = height[0];
			for(int i=1; i<n; i++){
				maxLeftBound[i] = Math.max(maxLeftBound[i-1], height[i]);
			}
		
		//calculate max right boundary - array
		int maxRightBound[] = new int[n];
		    maxRightBound[n-1] = height[n-1];
			for(int i=n-2; i>=0; i--){
				maxRightBound[i] = Math.max(maxRightBound[i+1], height[i]);
			}
			
			int trappedRainWater = 0;
		//loop
		for(int i=0; i<n; i++){
			//waterlevel = min(max left boundary, max right boundary)
			int waterlevel= Math.min(maxLeftBound[i], maxRightBound[i]);
			
			//trapRainWater = waterlevel - height
			trappedRainWater += waterlevel - height[i];
		}
		
		return trappedRainWater;
		
	}

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("\n"+trapRainWater(height)+"\n");
    }
}