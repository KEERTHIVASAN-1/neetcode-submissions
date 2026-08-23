class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>(map.keySet());
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(map.get(list.get(i))<map.get(list.get(j)))
                {
                    int temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        int []ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}
