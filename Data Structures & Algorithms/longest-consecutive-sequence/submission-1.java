class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        if(n==0)
        {
            return 0;
        }
        int count=1;
        int max=1;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]+1==arr[i+1])
            {
                count++;
            }
            else if(arr[i]==arr[i+1])
            {
                continue;
            }
            else
            {
                count=1;
            }
            if(count>max)
            {
                max=count;
            }
        }
        return max;
    }
}
