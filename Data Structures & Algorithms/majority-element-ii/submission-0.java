class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>(); 
        for(int num:map.keySet())
        {
            if(map.get(num)>n/3)
            {
                list.add(num);
            }
        }
        return list;
    }
}