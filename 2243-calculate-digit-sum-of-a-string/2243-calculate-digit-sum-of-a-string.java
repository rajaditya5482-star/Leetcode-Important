class Solution {
    public String digitSum(String s, int k) { 
        while(s.length()>k){
            String ans ="";
            int num = 0;
            for(int i=0;i<s.length();i++){
                num += s.charAt(i)-'0';
                if((i+1)%k==0){
                    ans+=String.valueOf(num);
                    num=0;
                }
            }
            if(s.length()%k!=0){
                ans+=String.valueOf(num);
            }
            s= ans;
        }
        return s;
    }
}