class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        boolean flag=true;
        if(s.length()!=t.length())
            {
                flag=false;
            }
        else{
            for(char ch : map1.keySet())
            {
                if(!map1.get(ch).equals(map2.getOrDefault(ch, 0)))
                {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
