class Solution {
    public String longestCommonPrefix(String[] s) {
        int n=s.length;
        String first=s[0];
        String ans="";
        boolean flag=true;
        for(int i=0;i<first.length();i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i >= s[j].length() || first.charAt(i) != s[j].charAt(i))
                {
                    flag=false;
                    break;
                }
            }
            if(!flag)
            {
                break;
            }
            ans=ans+first.charAt(i);
        }
        return ans; 
    }
}