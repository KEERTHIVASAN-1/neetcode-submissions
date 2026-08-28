class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        int i=0;
        for(int num:set)
        {
            arr[i]=num;
            i++;
        }
        return i;
    }
}