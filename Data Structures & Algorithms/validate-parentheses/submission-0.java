class Solution {
    public boolean isValid(String p) {
        int n=p.length();
        char []s=p.toCharArray();
        ArrayList<Character>list=new ArrayList<>();
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            char ch=s[i];
            if(ch=='(' || ch=='{' || ch=='[')
            {
                list.add(ch);
            }
            else
            {
                if(list.size()==0)
                {
                    flag=false;
                    break;
                }
                char last=list.get(list.size()-1);
                if(ch==')' && last=='(' 
                    || ch=='}' && last=='{' 
                    || ch==']' && last=='[')
                {
                    list.remove(list.size()-1);
                }
                else
                {
                    flag=false;
                    break;
                }
            }
        }
        if(list.size()!=0 )
        {
            flag=false;
        }
        return flag;
    }
}
