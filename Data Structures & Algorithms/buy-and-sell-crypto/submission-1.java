class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int finalmax=0;
        for(int i=0;i<n;i++)
        {
            int max=0;
            for(int j=i+1;j<n;j++)
            {
                max=arr[j]-arr[i];
                if(max>finalmax)
                {
                    finalmax=max;
                }
            }
        }
        return finalmax;
    }
}
