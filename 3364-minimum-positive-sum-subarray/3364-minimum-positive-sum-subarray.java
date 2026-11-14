class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        for(int i = l ; i<=r;i++){
            int a = 0;
            int b = 0;
            while(b<nums.size()){
                if(b-a+1==i&&sum(nums,a,b)>0){
                    min = Math.min(min,sum(nums,a,b));
                }
                if(b-a+1==i)a++;
                b++;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public int sum(List<Integer>arr,int l,int r){
        int sum = 0;
        for(int i = l;i<=r;i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}