class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        int k=1;
        for(;;k++)
        {
            if(!set.contains(k))
            {
                break;
            }
        }
        return k;
    }
}