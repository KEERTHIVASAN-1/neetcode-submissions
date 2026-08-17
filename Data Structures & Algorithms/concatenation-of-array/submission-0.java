class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            list.add(arr[i]);
        }
        int []finals=new int [list.size()];
        for(int i=0;i<list.size();i++)
        {
            finals[i]=list.get(i);
        }
        return finals;
    }
}