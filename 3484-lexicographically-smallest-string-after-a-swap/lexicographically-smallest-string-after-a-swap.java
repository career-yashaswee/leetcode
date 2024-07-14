class Solution {
    public String getSmallestString(String s) {
        int index1 = 0;
        int index2 = 1;
        while(index2<s.length()){
            char ac = s.charAt(index1);
            char bb = s.charAt(index2);
            int a = ac - '0';
            int b = bb - '0';
            if(!(a%2==0 && b%2!=0 || a%2!=0 && b%2==0) && a>b) {
                return s.substring(0,index1)+bb+ac+s.substring(index2+1,s.length());
            }
            index1++;
            index2++;
        }
        return s;
    }
}