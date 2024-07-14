class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int hIndex = m-2;
        int vIndex = n-2;
        int minCost = 0;
        int rowCount = 1;
        int colCount = 1;
        while(hIndex>=0 && vIndex>=0) {
            int hCut = horizontalCut[hIndex];
            int vCut = verticalCut[vIndex];
            if(hCut>vCut) {
                minCost += (hCut*colCount);
                rowCount++;
                hIndex--;
            } else {
                minCost += (vCut*rowCount);
                colCount++;
                vIndex--;
            }
        }
        while(hIndex>=0) {
            int hCut = horizontalCut[hIndex];
            minCost += (hCut*colCount);
            rowCount++;
            hIndex--;
        }

        while(vIndex>=0){
            int vCut = verticalCut[vIndex];
            minCost += (vCut*rowCount);
            colCount++;
            vIndex--;
        }

        return minCost;

    }
}