class Solution {
    public double averageWaitingTime(int[][] customers) {
        int csts = customers.length;
        int curr = 0;
        double total = 0;

        for(int i=0;i<csts;i++){
            int arrival = customers[i][0];
            if(arrival>curr)
                curr=arrival;
            curr += customers[i][1];
            total+=(curr-arrival);
        }
        total = total / csts;
        total = Math.round(total*Math.pow(10,5))/Math.pow(10,5);
        return total;
    }
}