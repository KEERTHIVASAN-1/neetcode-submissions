class Solution {
    public boolean hasDuplicate(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        boolean flag=false;
        for(int num:map.keySet())
        {
            if(map.get(num)>1)
            {
                flag=true;
            }
        }
        return flag;
    }
}