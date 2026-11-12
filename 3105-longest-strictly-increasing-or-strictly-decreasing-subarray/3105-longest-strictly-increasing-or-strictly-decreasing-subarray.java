class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int globalmax = 1;
        int globalmin = 1;
        for(int i=1;i<nums.length;i++){
            int strictlyincresing = 1;
            while(i<nums.length&&nums[i-1]<nums[i]){
                i++;
                strictlyincresing++;
            }
            globalmax = Math.max(globalmax,strictlyincresing);
        }
        for(int i=1;i<nums.length;i++){
            int strictlydecresing = 1;
            while(i<nums.length&&nums[i-1]>nums[i]){
                i++;
                strictlydecresing++;
            }
            globalmin = Math.max(globalmin,strictlydecresing);
        }
        return Math.max(globalmin,globalmax);
    }
}