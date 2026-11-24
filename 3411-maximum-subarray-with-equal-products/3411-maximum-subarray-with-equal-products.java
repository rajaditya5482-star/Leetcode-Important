class Solution {
    public int maxLength(int[] nums) {
        int max  = 0;
        for(int i=0;i<nums.length;i++){
            int gcd = nums[i];
            int lcm = nums[i];
            int prod = nums[i];
            for(int j=i+1;j<nums.length;j++){
                lcm = lcm(lcm,nums[j]);
                gcd = gcd(gcd,nums[j]);
                prod = nums[j]*prod;
                if(prod==lcm*gcd){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}