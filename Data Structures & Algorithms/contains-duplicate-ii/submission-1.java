class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    if(Math.abs(i-j)<=k)
                    {
                        flag=true;
                        break;
                    }
                }
            }
        }
        return flag;
    }
}