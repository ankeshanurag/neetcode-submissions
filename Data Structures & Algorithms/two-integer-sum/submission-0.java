class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int j=0;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
            if(mp.containsKey(nums[j])){
                if((target-nums[j])==nums[k]){
                    return new int[] {j,k};
                }
                
            }}
        }
        return new int[] {};
    }
}