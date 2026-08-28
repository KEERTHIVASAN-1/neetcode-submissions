class Solution {
    public String mergeAlternately(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        String rev="";
        int n=Math.max(n1,n2);
        for(int i=0;i<n;i++)
        {
            if(i<n1)
            {
                rev+=s1.charAt(i);
            }
            if(i<n2)
            {
                rev+=s2.charAt(i);
            }
        }
        return rev;
    }
}