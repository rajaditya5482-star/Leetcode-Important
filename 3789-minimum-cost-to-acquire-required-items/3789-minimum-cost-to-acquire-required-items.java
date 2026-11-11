class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost = 0L;

        cost = Math.min((long) costBoth, (long) cost1 + cost2)
                * Math.min(need1, need2);

        int need = Math.abs(need1 - need2);

        if (need1 > need2) {
            cost += Math.min((long) costBoth, cost1) * need;
        } else if (need1 < need2) {
            cost += Math.min((long) costBoth, cost2) * need;
        }

        return cost;
    }
}