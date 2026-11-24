class Solution {
    public int minRange(int a, int b, int c) {
        int min  = Math.min(Math.min(a,b),c);
        int max =  Math.max(Math.max(a,b),c);
        int sum = a+b+c;
        int other = sum-(max+min);
        if(max>other+min){
            max=other+min;
        }
       return max-min;
    }
}