class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k = k % n;
        int []brr=new int[n];
        int p=0;
        for(int i=n-k;i<n;i++)
        {
            brr[p]=arr[i];
            p++;
        }
        for(int i=0;i<n-k;i++)
        {
            brr[p]=arr[i];
            p++;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=brr[i];
        }
    }
}