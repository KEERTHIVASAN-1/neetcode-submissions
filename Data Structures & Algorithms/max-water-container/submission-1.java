class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int area=0;
            int width=0;
            int height=0;
            width=j-i;
            height=Math.min(arr[i],arr[j]);
            area=width*height;
            if(area>max)
            {
                max=area;
            }
            if(arr[i]<arr[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
