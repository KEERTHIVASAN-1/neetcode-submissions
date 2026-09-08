class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n=s.length();
        HashSet <Character>set=new HashSet<>();
        int count=0;
        int max=0;
        int i=0;
        for(int j=0;j<n;j++)
        {
            while(set.contains(s.charAt(j)))
            {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            count=j-i+1;
            if(count>max)
            {
                max=count;
            }
        }
        return max;
    }
}
