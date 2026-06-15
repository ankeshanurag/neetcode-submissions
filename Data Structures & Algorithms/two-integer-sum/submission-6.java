class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int j =0;j<nums.length;j++){
            int res = target-nums[j];
            if(mp.containsKey(res)){
                return new int[] {mp.get(res),j};
            }
            mp.put(nums[j],j);
        }
        return new int[] {};
    }
}