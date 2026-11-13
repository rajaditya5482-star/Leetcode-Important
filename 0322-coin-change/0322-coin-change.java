class Solution {
    public int coinChange(int[] coins, int amount) {
        int inf = Integer.MAX_VALUE;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,inf);
        dp[0] = 0;
        for(int coin : coins){
            for(int i = coin;i<amount+1;i++){
                if (dp[i - coin] != inf) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount]!=inf?dp[amount]:-1;
    }
}