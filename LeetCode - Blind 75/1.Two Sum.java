// 1. TWO SUM

class Solution {
    public int[] twoSum(int[] nums, int target) {
//         for(int i=0; i<nums.length-1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     res[0] = i;
//                     res[1] = j;
// 		    return new []int {i, j}; 
//                 }
//             }
//         }
	    
	    Map<Integer, Integer> hm = new HashMap<>();
	    for(int i=0; i<nums.length; i++){
		if(hm.containsKey(target - nums[i])){
			return new int[]{i, hm.get(target - nums[i])};
		}else{
			hm.put(nums[i], i);
		}
	    }
        return null;
    }
}
