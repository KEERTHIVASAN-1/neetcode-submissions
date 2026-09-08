class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n1=s1.length();
        int n2=s2.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n1;i++)
        {
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean flag=false;
        for(int i=0;i+n1<=n2;i++)
        {
            HashMap<Character,Integer>map2=new HashMap<>();
            for(int j=i;j<i+n1;j++)
            {
                char ch=s2.charAt(j);
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
            if(map.equals(map2))
            {
                flag=true;
                break;
            }
        }
        return flag;
    }
}
