class Solution {
    public int removeElement(int[] arr, int k) {
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(arr[i]);
        }
        list.removeIf(num->num==k);
        int []arr2=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr2[i]=list.get(i);
        }
        for(int i = 0; i < arr2.length; i++)
        {
            arr[i] = arr2[i];
        }
        int len=arr2.length;
        return len;
    }
}