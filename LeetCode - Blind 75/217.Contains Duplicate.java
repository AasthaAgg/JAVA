//   217.Contains Duplicates

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        HashSet<Integer> numset = new HashSet<>();
        for(int num : nums){
            if(numset.contains(num)){
                return true;
            }else{
                numset.add(num);
            }
        }
        return false;
    }
}
