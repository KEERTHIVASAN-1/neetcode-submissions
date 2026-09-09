class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int n=arr.length; 
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                list.add(arr[i]);
            }
            ArrayList<Integer>finallist=new ArrayList<>();
            int value=0;
            for(int i=0;i<k;i++)
            {
                int ans=Integer.MAX_VALUE;
                for(int j=0;j<list.size();j++)
                {
                    int d=Math.abs(list.get(j)-x);
                    if(d<ans)
                    {
                        ans=d;
                        value=list.get(j);
                    }
                }
                finallist.add(value);
                list.remove(Integer.valueOf(value));
            }
            Collections.sort(finallist);
            return(finallist);
    }
}