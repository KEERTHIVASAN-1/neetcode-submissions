class Solution {
    public int[] twoSum(int[] arr, int k) {
        int n=arr.length;
        int []brr=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    brr[0]=i;
                    brr[1]=j;
                    return brr;
                }
            }
        }
        return brr;
    }
}
