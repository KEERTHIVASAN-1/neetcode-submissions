class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        int k=1;
        for(int num:set)
        {
            if(!set.contains(k))
            {
                break;
            }
            k++;
        }
        return k;
    }
}