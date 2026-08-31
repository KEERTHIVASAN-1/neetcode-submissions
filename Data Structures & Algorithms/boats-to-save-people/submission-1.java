class Solution {
    public int numRescueBoats(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int sum=0;
        int count = 0;
        int i = 0;
        int j = n - 1;

        while(i <= j)
        {
            if(arr[i] + arr[j] <= k)
            {
                i++;
            }

            j--;
            count++;
        }
        return count;
    }
}