class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int st = 9;
        n=n-10;
        boolean alice = true;
        while(n>=st){
            n=n-st;
            st--;
            if(st%2==0){
                alice = false;
            }
            else{
                alice = true;
            }
        }
        return alice ;
    }
}