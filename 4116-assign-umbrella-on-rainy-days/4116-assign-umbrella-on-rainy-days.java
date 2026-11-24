class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] ans = new String[rain.length];
        int alice = 0 ;
        int bob  = 0;
        for(int i=0;i<rain.length;i++){
            if(i+1<rain.length&&rain[i]==1&&rain[i+1]==1&&alice<=bob){
                ans[i] = "Alice";
                alice++;
            }
            else if(rain[i]==1){
                ans[i] = "Bob";
                bob++;
            }
            else{
                ans[i] = "None";
            }
        }
        return ans;
    }
}