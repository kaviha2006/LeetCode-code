public class Q1672_richest_customer_wealth {
    public int maximumWealth(int[][] z) {
        int row=z.length;
        int col=z[0].length;
        int max=0;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++)
            sum+=z[i][j];
            max=Math.max(sum,max);
        }
        return max;
    }
}
/*output:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
 */