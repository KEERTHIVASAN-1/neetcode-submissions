class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        String rev="";
        String original="";
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                original+=Character.toLowerCase(ch);
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                rev+=Character.toLowerCase(ch);
            }
        }
        if(rev.equals(original))
        {
            flag=true;
        }
        return flag;
    }
}
