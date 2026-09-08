class Solution {
    public int minSubArrayLen(int k, int[] arr) {
            int n=arr.length;
            int sum=0;
            int finalans=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                sum=0;
                int count=0;
                for(int j=i;j<n;j++)
                {
                    count++;
                    sum=sum+arr[j];
                    if(sum>=k)
                    {
                       if(count<finalans)
                       {
                           finalans=count;
                       }
                       break;
                    }
                } 
            }
            if(finalans==Integer.MAX_VALUE)
            {
                finalans=0;
            }
            return finalans;
    }
}