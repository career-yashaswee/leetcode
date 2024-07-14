class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int hIndex = m - 2;
        int vIndex = n - 2;
        long minCost = 0;
        int rowCount = 1;
        int colCount = 1;
        while(hIndex>=0 && vIndex>=0) {
            int hCost = horizontalCut[hIndex];
            int vCost = verticalCut[vIndex];
            if(hCost>vCost) {
                minCost += (hCost*colCount);
                rowCount++;
                hIndex--;
            } else {
                minCost += (vCost*rowCount);
                colCount++;
                vIndex--;
            }
        }
        while(hIndex>=0) {
            int hCost = horizontalCut[hIndex];
            minCost += (hCost*colCount);
            rowCount++;
            hIndex--;           
        }

        while(vIndex>=0) {
            int vCost = verticalCut[vIndex];
            minCost += (vCost*rowCount);
            colCount++;
            vIndex--;           
        }
        return minCost;
    }
}