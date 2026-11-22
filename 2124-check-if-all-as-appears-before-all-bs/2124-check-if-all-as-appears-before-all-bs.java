class Solution {
    public boolean checkString(String s) {
        boolean check = true;
        boolean foundB = false;
        for(int i =0 ;i<s.length();i++){
            if(s.charAt(i)=='b')foundB=true;
            if(foundB&&s.charAt(i)=='a')check=false;
        }
        return check;
    }
}