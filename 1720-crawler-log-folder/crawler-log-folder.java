class Solution {
    public int minOperations(String[] logs) {
        int ops = 0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")) {
                ops--;
                if(ops<0)
                    ops=0;
            } else if(logs[i].equals("./")) {
                //pass
            } else {
                ops++;
            }
        }
        return ops;
    }
}