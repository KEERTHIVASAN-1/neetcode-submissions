class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans=0;
        for(int num:map.keySet())
        {
            if(map.get(num)>(n/2))
            {
                ans=num;
                break;
            }
        }
        return ans;
    }
}